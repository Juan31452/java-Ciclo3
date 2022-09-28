package mintic.grupo61.CovidCol.modelo.usuario;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Data;
import mintic.grupo61.CovidCol.modelo.ciudad.Ciudad;
//import org.hibernate.mapping.Set;

@Data // se encarga de los getters y setters
@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idusuario", nullable = false)
  private Long Idusuario;
  @Column(name = "nombres", nullable = false, length = 50)
  private String nombres; 
  @Column(name = "apellidos", nullable = false, length = 50)
  private String apellidos;
  @Column(name = "pais_nacimiento", nullable = false, length = 30)
  private String pais_nacimiento;
  @Column(name = "fecha_nacimiento")
  // @DateTimeFormat(pattern = "dd-MM-AAAA")
  // @Temporal(TemporalType.DATE)
  private String fecha_nacimiento;
  @Column(name = "dpto_residencia", nullable = false, length = 30)
  private String dpto_residencia;
  @Column(name = "ciudad_residencia", nullable = false, length = 30)
  private String ciudad_residencia;
  @Column(name = "direccion", length = 30)
  private String direccion;
  @Column(name = "tipo_documento", nullable = false, length = 2)
  private String tipo_documento;
  @Column(name = "numero_documento", nullable = false, length = 20)
  private String numero_documento;
  @Column(name = "npasaporte", nullable = false, length = 20)
  private String npasaporte;
  // @Temporal(TemporalType.DATE)
  @Column
  private String fecha_vencepasaporte;
  @Column(name = "Correo", nullable = false, length = 30)
  private String correo;
  @Column(name = "Contrasena", nullable = false, length = 20)
  private String contrasena;
  @Column(name = "Confirmar_Contrasena", nullable = false, length = 20)
  private String confirmar_contrasena;

  @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinTable(name = "usuarios_ciudad", joinColumns = {
      @JoinColumn(name = "usuarios_id", referencedColumnName = "idusuario", nullable = false, updatable = false)
  }, inverseJoinColumns = {
      @JoinColumn(name = "ciudad_id", referencedColumnName = "idciudad", nullable = false, updatable = false)
  })
  // @OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL)
  // private List<Ciudad> ciudad = new ArrayList<Ciudad>();
  private List<Ciudad> ciudad ; 


  
  
}
