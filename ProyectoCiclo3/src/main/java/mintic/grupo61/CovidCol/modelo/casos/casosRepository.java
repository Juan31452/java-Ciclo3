package mintic.grupo61.CovidCol.modelo.casos;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
// Interface que contiene el CRUD con Spring JPA para la tabla de ciudad.
public interface casosRepository extends CrudRepository<Casos, Long> 
{
      @Transactional

//   @Query(value = "select ca.Id,ca.departamento,ca.municipio,ca.edad,ca.sexo,ca.tipoContagio,ca.estado,ca.recuperado"
//         + "  from casos ca  ", nativeQuery = true)
//   public List<Casos> listacasos();
//   
//
//    @Query(value = "select count(ca.estado) as total from casos ca where ca.estado = 'Leve' ", nativeQuery = true)
//    long activos(String estado);
//    
    long countByestado(String estado);
    long countByrecuperado(String recuperado);
    
    
 
      
}
