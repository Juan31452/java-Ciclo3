package mintic.grupo61.CovidCol.servicios;

import java.util.List;
import mintic.grupo61.CovidCol.modelo.ciudad.Ciudad;
import mintic.grupo61.CovidCol.modelo.usuario.Usuarios;

public interface CiudadServicio 
{
   Ciudad guardarciudad(Ciudad ciudad);
   List<Ciudad> buscarultimo();    
}
