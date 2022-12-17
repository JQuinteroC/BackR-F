import { CategoriaProductoEntity } from 'src/categoria_producto/categoria_producto.entity';
import {
  Column,
  Entity,
  PrimaryGeneratedColumn,
  JoinColumn,
  OneToOne,
  ManyToOne,
} from 'typeorm';
import DatabaseFile from './databaseFile.entity';

@Entity('Producto')
export class ProductoEntity {
  @PrimaryGeneratedColumn('identity')
  readonly pk_idProducto: number;

  @Column()
  readonly n_nombre: string;

  @Column()
  readonly q_unidades: number;

  @Column()
  readonly i_personalizable: boolean;

  @Column()
  readonly v_precio: number;

  @ManyToOne(
    () => CategoriaProductoEntity,
    (cateogriaProducto) => cateogriaProducto.pk_idCategoria,
  )
  readonly fk_idCategoria: CategoriaProductoEntity;

  @JoinColumn({ name: 'i_foto' })
  @OneToOne(() => DatabaseFile, {
    nullable: true,
  })
  public i_foto?: DatabaseFile;

  @Column({ nullable: true })
  public i_fotoId?: number;

  constructor(
    pk_idCategoria: number,
    n_nombre: string,
    q_unidades: number,
    i_personalizable: boolean,
    v_precio: number,
    fk_idCategoria: CategoriaProductoEntity,
    i_foto?: DatabaseFile,
    i_fotoId?: number,
  ) {
    this.pk_idProducto = pk_idCategoria;
    this.n_nombre = n_nombre;
    this.q_unidades = q_unidades;
    this.i_personalizable = i_personalizable;
    this.v_precio = v_precio;
    this.fk_idCategoria = fk_idCategoria;
    this.i_foto = i_foto;
    this.i_fotoId = i_fotoId;
  }
}
