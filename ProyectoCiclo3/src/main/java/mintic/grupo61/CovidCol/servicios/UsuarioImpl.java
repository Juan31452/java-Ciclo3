package mintic.grupo61.CovidCol.servicios;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mintic.grupo61.CovidCol.modelo.usuario.Usuarios;
import mintic.grupo61.CovidCol.modelo.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
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

    @Override
    public Usuarios guardarusuario(Usuarios usuarios) 
    {
        
      return usuarior.save(usuarios);
    }

    @Override
    public List<Usuarios> buscarusuario(String correo, String contraseña) 
    {
     return usuarior.consultausuario(correo, contraseña);
    }

    @Override
    public List<Usuarios> editarusuario(Long id) {
      return usuarior.consultausuario1(id);
    }

//    @Override
//    public Usuarios findByIdusuario(Long id) {
//        return usuarior.findByIdusuario(id);
//    }

 
 }