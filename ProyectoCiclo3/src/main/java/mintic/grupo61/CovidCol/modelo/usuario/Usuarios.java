
package mintic.grupo61.CovidCol.modelo.usuario;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import java.io.Serializable;
import static java.time.temporal.WeekFields.ISO;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data //se encarga de los getters y setters
@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable 
{
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long Idusuario;
  @Column        
  private String nombres;
  @Column        
  private String apellidos;
  @Column        
  private String pais_nacimiento;
  @Column
  //@DateTimeFormat(pattern = "dd-MM-AAAA")
  //@Temporal(TemporalType.DATE)
  private String fecha_nacimiento;
  @Column        
  private String dpto_residencia;
  @Column        
  private String ciudad_residencia;  
  @Column        
  private String direccion;
  @Column        
  private String tipo_documento;
  @Column        
  private String numero_documento;
  @Column        
  private String npasaporte;
  //@Temporal(TemporalType.DATE)
  @Column   
  //@DateTimeFormat(pattern = "dd-MM-AAAA")
  //@Temporal(TemporalType.DATE)
  private String fecha_vencepasaporte;
  @Column
  private String correo;
  @Column
  private String contraseña;
  @Column
  private String confirmar_contraseña;
  


 
}

