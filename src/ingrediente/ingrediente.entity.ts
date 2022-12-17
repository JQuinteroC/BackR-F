import { TipoUnidadEntity } from 'src/tipo_unidad/tipo_unidad.entity';
import { Column, Entity, PrimaryGeneratedColumn, ManyToOne } from 'typeorm';

@Entity('Ingrediente')
export class IngredienteEntity {
  @PrimaryGeneratedColumn('identity')
  readonly pk_idIngrediente: number;

  @Column()
  readonly q_unidades: number;

  @ManyToOne(() => TipoUnidadEntity, (tipoUnidad) => tipoUnidad.pk_idUnidad)
  readonly fk_idUnidad: TipoUnidadEntity;

  @Column()
  readonly n_nombre: string;

  constructor(
    pk_idIngrediente: number,
    q_unidades: number,
    fk_idUnidad: TipoUnidadEntity,
    n_nombre: string,
  ) {
    this.pk_idIngrediente = pk_idIngrediente;
    this.q_unidades = q_unidades;
    this.fk_idUnidad = fk_idUnidad;
    this.n_nombre = n_nombre;
  }
}
