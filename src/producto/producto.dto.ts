import { ApiProperty } from '@nestjs/swagger';
import { CategoriaProductoEntity } from 'src/categoria_producto/categoria_producto.entity';
import DatabaseFile from './databaseFile.entity';

export class ProductoDTO {
  @ApiProperty()
  pk_idProducto?: number;

  @ApiProperty()
  readonly n_nombre: string;

  @ApiProperty()
  readonly q_unidades: number;

  @ApiProperty()
  readonly i_personalizable: boolean;

  @ApiProperty()
  readonly v_precio: number;

  @ApiProperty()
  readonly fk_idCategoria: CategoriaProductoEntity;

  @ApiProperty()
  readonly i_foto?: DatabaseFile;

  @ApiProperty()
  public i_fotoId?: number;

  constructor(
    pk_idCategoria: number,
    q_unidades: number,
    n_nombre: string,
    i_personalizable: boolean,
    v_precio: number,
    fk_idCategoria: CategoriaProductoEntity,
    i_foto?: DatabaseFile,
    i_fotoId?: number,
  ) {
    this.pk_idProducto = pk_idCategoria;
    this.q_unidades = q_unidades;
    this.n_nombre = n_nombre;
    this.i_personalizable = i_personalizable;
    this.v_precio = v_precio;
    this.fk_idCategoria = fk_idCategoria;
    this.i_foto = i_foto;
    this.n_nombre = n_nombre;
    this.i_fotoId = i_fotoId;
  }
}