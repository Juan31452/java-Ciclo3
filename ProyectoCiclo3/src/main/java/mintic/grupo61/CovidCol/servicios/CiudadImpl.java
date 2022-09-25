package mintic.grupo61.CovidCol.servicios;

import java.util.List;
import mintic.grupo61.CovidCol.modelo.ciudad.Ciudad;
import mintic.grupo61.CovidCol.modelo.ciudad.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadImpl implements CiudadServicio 
{

    @Autowired 
    private CiudadRepository ciudadr;
    
    @Override
    public Ciudad guardarciudad(Ciudad ciudad) {
         return ciudadr.save(ciudad);
   }

    @Override
    public List<Ciudad> buscarultimo() {
      return ciudadr.ultimoviaje();
    }
       
}
