package mintic.grupo61.CovidCol.modelo.ciudad;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//Interface que contiene el CRUD con Spring JPA para la tabla de ciudad.
public interface CiudadInterface extends CrudRepository<Ciudad, Long>
{
       
}
