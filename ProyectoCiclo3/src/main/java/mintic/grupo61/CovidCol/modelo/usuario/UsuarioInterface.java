
package mintic.grupo61.CovidCol.modelo.usuario;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
//Interface que contiene el CRUD con Spring JPA para la tabla de usuarios.
public interface UsuarioInterface extends CrudRepository<Usuarios, Long> 
{
  @Transactional
  //Optional<Usuarios> findBycorreo(String correo);
  //List<Usuarios> findBycorreoAndcontraseña(String correo, String contraseña);
  @Query (value = "select u.Idusuario,u.npasaporte,u.correo,u.contraseña,u.telefono,u.nacionalidad,u.eps"
          + "  from Usuarios u where u.correo =:micorreo and contraseña=:micontraseña", nativeQuery = true)
  public List<Usuarios> consultausuario(@Param("micorreo")  String correo,@Param("micontraseña") String contraseña);
  
}


