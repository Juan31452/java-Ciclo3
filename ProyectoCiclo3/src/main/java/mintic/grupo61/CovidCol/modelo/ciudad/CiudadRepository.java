package mintic.grupo61.CovidCol.modelo.ciudad;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
// Interface que contiene el CRUD con Spring JPA para la tabla de ciudad.
public interface CiudadRepository extends CrudRepository<Ciudad, Long> {
   @Transactional

   @Query(value = "select c.Idciudad,c.ciudad_actual,c.ciudad_destino,c.numero_vacunas,c.sintomas,c.usuario_idusuario"
         + "  from ciudad c where c.Idciudad = (select max(Idciudad) from ciudad ) ", nativeQuery = true)
   public List<Ciudad> ultimoviaje();
   
   @Query(value = "select c.usuario_idusuario"
         + "  from ciudad c where c.Idciudad = (select max(Idciudad) from ciudad ) ", nativeQuery = true)
   public List<Ciudad> nombreusuario();
}
