package mintic.grupo61.CovidCol.modelo.ciudad;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data //se encarga de los getters y setters
@Entity
@Table(name = "ciudad")

public class Ciudad implements Serializable
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long Idciudad;
  @Column        
  private String ciudad_actual;
  @Column        
  private String ciudad_destino;
  @Column        
  private Integer numero_vacunas;
  @Column
  private String sintomas;
  @Column        
  private Long Idusuario;
    
}
