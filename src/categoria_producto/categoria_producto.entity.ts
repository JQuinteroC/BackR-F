import { Column, Entity, PrimaryGeneratedColumn } from 'typeorm';

@Entity('Categoria_producto')
export class CategoriaProductoEntity {
  @PrimaryGeneratedColumn('identity')
  readonly pk_idCategoria: number;

  @Column()
  readonly n_nombre: string;

  constructor(pk_idCategoria: number, n_nombre: string) {
    this.pk_idCategoria = pk_idCategoria;
    this.n_nombre = n_nombre;
  }
}
