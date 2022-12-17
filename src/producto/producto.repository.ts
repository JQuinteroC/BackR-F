import { Injectable } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { DeleteResult, Repository } from 'typeorm';
import { ProductoDTO } from './producto.dto';
import { ProductoEntity } from './producto.entity';
import { ProductoMapper } from './producto.mapper';

@Injectable()
export class ProductoRepository {
  constructor(
    @InjectRepository(ProductoEntity)
    private ingredienteEntity: Repository<ProductoEntity>,
    private mapper: ProductoMapper,
  ) {}

  getAll(): Promise<ProductoEntity[]> {
    return this.ingredienteEntity.find();
  }

  getById(id: number): Promise<ProductoEntity> {
    return this.ingredienteEntity.findOne({
      where: { pk_idProducto: id },
    });
  }

  new(productoDTO: ProductoDTO): Promise<ProductoEntity> {
    const newTipoUnidad = this.mapper.dtoToEntity(productoDTO);
    return this.ingredienteEntity.save(newTipoUnidad);
  }

  async update(productoDTO: ProductoDTO, id: number): Promise<ProductoEntity> {
    productoDTO.pk_idProducto = id;
    const updateUser = this.mapper.dtoToEntity(productoDTO);
    await this.ingredienteEntity.update(id, updateUser);
    return this.ingredienteEntity.findOne({ where: { pk_idProducto: id } });
  }

  delete(id: number): Promise<DeleteResult> {
    return this.ingredienteEntity.delete(id);
  }
}
