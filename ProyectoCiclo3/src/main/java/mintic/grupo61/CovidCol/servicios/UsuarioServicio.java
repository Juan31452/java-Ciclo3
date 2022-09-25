package mintic.grupo61.CovidCol.servicios;

import java.util.List;
import mintic.grupo61.CovidCol.modelo.usuario.Usuarios;

public interface UsuarioServicio 
{
   List<Usuarios> Todos();  
   Usuarios guardarusuario(Usuarios usuarios);
   List<Usuarios> buscarusuario(String correo, String contraseña);
}
