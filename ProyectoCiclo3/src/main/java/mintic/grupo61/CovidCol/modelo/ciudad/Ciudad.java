package mintic.grupo61.CovidCol.modelo.ciudad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import mintic.grupo61.CovidCol.modelo.usuario.Usuarios;

@Data // se encarga de los getters y setters
@Entity
@Table(name = "ciudad")
public class Ciudad implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idciudad", nullable = false)
  private Long Idciudad;
  @Column(name = "ciudad_actual")
  private String ciudad_actual;
  @Column(name = "ciudad_destino")
  private String ciudad_destino;
  @Column(name = "numero_vacunas")
  private Integer numero_vacunas;
  @Column(name = "sintomas")
  private String sintomas;
  // @Column(name = "Idusuario")
  // private Long Idusuario;

  public Ciudad() {
  }

  public Ciudad(String ciudad_actual, String ciudad_destino, Integer numero_vacunas, String sintomas, Long Idusuario) {
    this.ciudad_actual = ciudad_actual;
    this.ciudad_destino = ciudad_destino;
    this.numero_vacunas = numero_vacunas;
    this.sintomas = sintomas;
  }

  @ManyToMany(mappedBy = "ciudad", fetch = FetchType.LAZY)
  private Set<Usuarios> usuario = new HashSet<>();

}
