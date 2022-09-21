package mintic.grupo61.CovidCol.modelo.ciudad;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import mintic.grupo61.CovidCol.modelo.usuario.Usuarios;

@Data //se encarga de los getters y setters
@Entity
@Table(name = "ciudad")

public class Ciudad implements Serializable
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Idciudad",nullable = false)
  private Long Idciudad;
  @Column(name = "Ciudad_Actual")        
  private String ciudad_actual;
  @Column(name = "Ciudad_Destino")        
  private String ciudad_destino;
  @Column(name = "Numero_Vacunas")        
  private Integer numero_vacunas;
  @Column(name = "Sintomas")
  private String sintomas;
  @Column(name = "Idusuario")        
  private Long Idusuario;
  
  //@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
  //@JoinColumn(name="Idusuario")
  //Usuarios usuarios;
  
}
