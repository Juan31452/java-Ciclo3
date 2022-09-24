package mintic.grupo61.CovidCol.servicios;

import java.util.List;
import mintic.grupo61.CovidCol.modelo.usuario.Usuarios;
import mintic.grupo61.CovidCol.modelo.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioImpl implements UsuarioServicio
{
    @Autowired 
    private UsuarioRepository usuarior;
    
    public UsuarioImpl(UsuarioRepository usuarior ) {
        this.usuarior = usuarior;
    }

   @Override
    public List<Usuarios> Todos() {

        return (List<Usuarios>) usuarior.findAll();
    }
    
}
