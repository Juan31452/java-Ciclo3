package mintic.grupo61.CovidCol.modelo.casos;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
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
    @Query(value = "select count(ca.id) as total from casos ca where ca.municipio ='BOGOTA' ", nativeQuery = true)
    long casosciudad();
    
    @Query(value = "select count(ca.id) as total from casos ca where ca.municipio ='CALI' ", nativeQuery = true)
    long casosciudad1();
    
    @Query(value = "select count(ca.id) as total from casos ca where ca.municipio ='MEDELLIN' ", nativeQuery = true)
    long casosciudad2();
    
    @Query(value = "select count(ca.id) as total from casos ca where ca.municipio ='PASTO' ", nativeQuery = true)
    long casosciudad3();
    
    @Query(value = "select count(ca.id) as total from casos ca where ca.municipio ='CARTAGENA' ", nativeQuery = true)
    long casosciudad4();
    
    long countByestado(String estado);
    long countByrecuperado(String recuperado);
    
    
 
      
}
