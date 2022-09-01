
package mintic.grupo61.CovidCol.modelo.usuario;


import org.springframework.data.repository.CrudRepository;

 //Interface que contiene el CRUD con Spring JPA para la tabla de usuarios.
public interface UsuarioInterface extends CrudRepository<Usuarios, Long> 
{
    
}
