/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic.grupo61.CovidCol.modelo.usuario;

/**
 *
 * @author juank
 */
public class UsuarioDao {
     private Long Idusuario;
  private String npasaporte;
  private String correo;
  private String contraseña;
  private String telefono;
  private String nacionalidad;
  private String eps;

    public UsuarioDao() {
    }

    public Long getIdusuario() {
        return Idusuario;
    }

    public void setIdusuario(Long Idusuario) {
        this.Idusuario = Idusuario;
    }

    public String getNpasaporte() {
        return npasaporte;
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
 
  
  
}
