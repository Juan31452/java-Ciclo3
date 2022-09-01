
package mintic.grupo61.CovidCol.modelo.usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//Clase que implementa los metodos logica negocio de UsuarioServicio

@Service
public class ImplementaUsuServ implements UsuarioServicio 
{   
    @Autowired
    private UsuarioInterface usuariointerface;
            
    @Override
    public List<Usuarios> consultarUsuarios() {
       List<Usuarios> usuarioDataSource = StreamSupport.stream(
				this.usuariointerface.findAll().spliterator(), false)
				.collect(Collectors.toList());
		
		return usuarioDataSource;
    }

    @Override
    public Usuarios guardarUsuario(Usuarios usuario) {
       return this.usuariointerface.save(usuario);
    }

    @Override
    public Usuarios actualizarUsuario(Usuarios usuario) {
       return this.usuariointerface.save(usuario);
    }

    @Override
    public void eliminarUsuario(long Idusuario) {
        this.usuariointerface.deleteById(Idusuario);
    }
    
}
