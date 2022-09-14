
package mintic.grupo61.CovidCol.modelo.usuario;

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
@Table(name = "usuarios")
public class Usuarios implements Serializable 
{
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long Idusuario;
  @Column        
  private String npasaporte;
  @Column
  private String correo;
  @Column
  private String contraseña;
  @Column
  private String telefono;
  @Column
  private String nacionalidad;
  @Column
  private String eps;



 
}

