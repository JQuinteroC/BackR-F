import { Injectable } from '@nestjs/common';
import DatabaseFilesService from './databaseFiles.service';
import { ProductoDTO } from './producto.dto';
import { ProductoEntity } from './producto.entity';
import { ProductoMapper } from './producto.mapper';
import { ProductoRepository } from './producto.repository';

@Injectable()
export class ProductoService {
  constructor(
    private productoRepository: ProductoRepository,
    private mapper: ProductoMapper,
    private readonly databaseFilesService: DatabaseFilesService,
  ) {}

  async getAll(): Promise<ProductoDTO[]> {
    const producto: ProductoEntity[] = await this.productoRepository.getAll();
    return producto.map((producto) => this.mapper.entityToDto(producto));
  }

  async getById(id: number): Promise<ProductoDTO> {
    const producto: ProductoEntity = await this.productoRepository.getById(id);
    return this.mapper.entityToDto(producto);
  }

  async new(productoDTO: ProductoDTO): Promise<ProductoDTO> {
    const newUser: ProductoEntity = await this.productoRepository.new(
      productoDTO,
    );
    return this.mapper.entityToDto(newUser);
  }

  async update(id: number, productoDTO: ProductoDTO): Promise<ProductoDTO> {
    const updateUser = await this.productoRepository.update(productoDTO, id);
    return this.mapper.entityToDto(updateUser);
  }

  async delete(id: number): Promise<void> {
    await this.productoRepository.delete(id);
  }

  async addFoto(id: number, imageBuffer: Buffer, filename: string) {
    const foto = await this.databaseFilesService.uploadDatabaseFile(
      imageBuffer,
      filename,
    );
    return await this.productoRepository.update(
      {
        i_foto: foto,
        i_fotoId: foto.id,
        n_nombre: '',
        q_unidades: 0,
        i_personalizable: false,
        v_precio: 0,
        fk_idCategoria: undefined,
      },
      id,
    );
  }
}
