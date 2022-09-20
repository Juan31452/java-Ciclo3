
package mintic.grupo61.CovidCol.modelo.usuario;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import java.io.Serializable;
import static java.time.temporal.WeekFields.ISO;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import mintic.grupo61.CovidCol.modelo.ciudad.Ciudad;
import org.springframework.format.annotation.DateTimeFormat;

@Data //se encarga de los getters y setters
@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable 
{
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Idusuario")
  private Long Idusuario;
  @Column(name = "Nombres")        
  private String nombres;
  @Column(name = "Apellidos")        
  private String apellidos;
  @Column(name = "Pais_nacimiento")        
  private String pais_nacimiento;
  @Column(name = "Fecha_Nacimiento")
  //@DateTimeFormat(pattern = "dd-MM-AAAA")
  //@Temporal(TemporalType.DATE)
  private String fecha_nacimiento;
  @Column(name = "Dpto_Residencia")        
  private String dpto_residencia;
  @Column(name = "Ciudad_Residencia")        
  private String ciudad_residencia;  
  @Column(name = "Direccion")        
  private String direccion;
  @Column(name = "Tipo_Documento")        
  private String tipo_documento;
  @Column(name = "Numero_Documento")        
  private String numero_documento;
  @Column(name = "Npasaporte")        
  private String npasaporte;
  //@Temporal(TemporalType.DATE)
  @Column(name = "Fecha_VencePasaporte")   
  private String fecha_vencepasaporte;
  @Column(name = "Correo")
  private String correo;
  @Column(name = "Contraseña")
  private String contraseña;
  @Column(name = "Confirmar_Contraseña")
  private String confirmar_contraseña;
  
  //@OneToMany(mappedBy = "Idusuario")
  //List<Ciudad> listaciudad;
  
}

