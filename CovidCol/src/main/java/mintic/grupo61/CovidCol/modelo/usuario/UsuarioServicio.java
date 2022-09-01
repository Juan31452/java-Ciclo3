
package mintic.grupo61.CovidCol.modelo.usuario;
//  Interface que contiene los metodos de logica de negocio para los Usuarios

import java.util.List;

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
        
}
