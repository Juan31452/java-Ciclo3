
package mintic.grupo61.CovidCol.modelo.usuario;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
//Interface que contiene el CRUD con Spring JPA para la tabla de usuarios.
public interface UsuarioRepository extends CrudRepository<Usuarios, Long> 
{
  @Transactional
  //Optional<Usuarios> findBycorreo(String correo);
  //List<Usuarios> findBycorreoAndcontraseña(String correo, String contraseña);
  @Query (value = "select u.Idusuario,u.nombres,u.apellidos,u.pais_nacimiento,u.fecha_nacimiento,u.dpto_residencia,u.ciudad_residencia,"
          + "u.direccion,u.tipo_documento,u.numero_documento,u.npasaporte,u.fecha_vencepasaporte,u.correo,u.contrasena,u.confirmar_contrasena"
          + "  from usuarios u where u.correo =:micorreo and contrasena=:micontrasena", nativeQuery = true)
  public List<Usuarios> consultausuario(@Param("micorreo")  String correo,@Param("micontrasena") String contrasena);
  
  @Query (value = "select u.Idusuario,u.nombres,u.apellidos,u.pais_nacimiento,u.fecha_nacimiento,u.dpto_residencia,u.ciudad_residencia,"
          + "u.direccion,u.tipo_documento,u.numero_documento,u.npasaporte,u.fecha_vencepasaporte,u.correo,u.contrasena,u.confirmar_contrasena"
          + "  from usuarios u where u.Idusuario =:miid ", nativeQuery = true)
  public List<Usuarios> consultausuario1(@Param("miid") Long Idusuario);

    //Usuarios findByIdusuario(Long id);
  
  
}


