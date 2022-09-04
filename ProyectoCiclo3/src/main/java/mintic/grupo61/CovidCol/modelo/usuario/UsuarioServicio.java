
package mintic.grupo61.CovidCol.modelo.usuario;
//  Interface que contiene los metodos de logica de negocio para los Usuarios

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
@Service
public interface UsuarioServicio 
{
    //Metodo que permite consultar un listado de usuario   
    List<Usuarios> consultarUsuarios();
        
    //Metodo que permite guardar un usuario    
    Usuarios guardarUsuario(Usuarios usuario);
    
    //Metodo que permite actualizar un usuario    
    Usuarios actualizarUsuario(Usuarios usuario);
    
    //Metodo que permite eliminar un usuario    
    void eliminarUsuario(long Idusuario);

    //buscar por id
    Usuarios buscarid(long Idusuario);
    
    //buscar po pasaporte    
    Optional<Usuarios> buscarporpasaporte(String npasaporte);
        
}
