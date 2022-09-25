
package mintic.grupo61.CovidCol.modelo.usuario;

import java.io.Serializable;
import static java.time.temporal.WeekFields.ISO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import mintic.grupo61.CovidCol.modelo.ciudad.Ciudad;
//import org.hibernate.mapping.Set;

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
  @Column   
  private String fecha_vencepasaporte;
  @Column(name = "Correo")
  private String correo;
  @Column(name = "Contraseña")
  private String contraseña;
  @Column(name = "Confirmar_Contraseña")
  private String confirmar_contraseña;
  
  @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
  @JoinTable(name = "usuarios_ciudad", joinColumns = {
            @JoinColumn(name = "usuarios_id", referencedColumnName = "Idusuario", nullable = false, updatable = false)
    }, inverseJoinColumns = {
            @JoinColumn(name = "ciudad_id", referencedColumnName = "Idciudad", nullable = false, updatable = false)
    })
//  @OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL)
  //private List<Ciudad> ciudad = new ArrayList<Ciudad>();
  private Set<Ciudad> ciudad = new HashSet<>();

    public Usuarios() {
    }

    public Usuarios(String nombres, String apellidos, String pais_nacimiento, String fecha_nacimiento, String dpto_residencia, String ciudad_residencia, String direccion, String tipo_documento, String numero_documento, String npasaporte, String fecha_vencepasaporte, String correo, String contraseña, String confirmar_contraseña) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.pais_nacimiento = pais_nacimiento;
        this.fecha_nacimiento = fecha_nacimiento;
        this.dpto_residencia = dpto_residencia;
        this.ciudad_residencia = ciudad_residencia;
        this.direccion = direccion;
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.npasaporte = npasaporte;
        this.fecha_vencepasaporte = fecha_vencepasaporte;
        this.correo = correo;
        this.contraseña = contraseña;
        this.confirmar_contraseña = confirmar_contraseña;
    }

   
  
}

