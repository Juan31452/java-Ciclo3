
package mintic.grupo61.CovidCol.modelo.usuario;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
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
  
    //Constructor
    public Usuarios() {
        
    }
 
    public String getNpasaporte() {
        return npasaporte;
    }

    public Long getIdusuario() {
        return Idusuario;
    }

    public void setIdusuario(Long Idusuario) {
        this.Idusuario = Idusuario;
    }

    public void setNpasaporte(String npasaporte) {
        this.npasaporte = npasaporte;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }
  
    @Override
    public String toString() 
    {
        return String.format("%-15s %-20s %-10s %-12s %-12s %-12s ", npasaporte, correo,contraseña,telefono,nacionalidad,eps );    
    }      
}
