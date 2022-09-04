
package mintic.grupo61.CovidCol.modelo.usuario;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//Interface que contiene el CRUD con Spring JPA para la tabla de usuarios.
public interface UsuarioInterface extends CrudRepository<Usuarios, Long> 
{
  @Transactional
  Optional<Usuarios> findBynpasaporte(String npasaporte);
   
}
