package mintic.grupo61.CovidCol.servicios;

import java.util.List;
import java.util.Optional;
import mintic.grupo61.CovidCol.modelo.usuario.Usuarios;

public interface UsuarioServicio 
{
   List<Usuarios> Todos();  
   Usuarios guardarusuario(Usuarios usuarios);
   List<Usuarios> buscarusuario(String correo, String contraseña);
   List<Usuarios> editarusuario(Long id);
 //  Usuarios findByIdusuario(Long id);
}
