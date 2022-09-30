package mintic.grupo61.CovidCol.modelo.ciudad;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import mintic.grupo61.CovidCol.modelo.usuario.Usuarios;

@Data // se encarga de los getters y setters
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "ciudad")
public class Ciudad implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @EqualsAndHashCode.Include()
  //@Column(name = "idciudad")
  private Long Idciudad;
  @Column(name = "ciudad_actual", nullable = false, length = 30)
  private String ciudad_actual;
  @Column(name = "ciudad_destino", nullable = false, length = 30)
  private String ciudad_destino;
  @Column(name = "numero_vacunas", nullable = false, length = 2)
  private Integer numero_vacunas;
  @Column(name = "sintomas",nullable = false, length = 150)
  private String sintomas;
  //@Column(name = "usuario",nullable = false)
  //private Long usuario;

  
//  @ManyToMany(mappedBy = "muchasciudades", fetch = FetchType.LAZY)
//  private Set<Usuarios> usuario = new HashSet();

  @ManyToOne
  private Usuarios usuario;

  
}
