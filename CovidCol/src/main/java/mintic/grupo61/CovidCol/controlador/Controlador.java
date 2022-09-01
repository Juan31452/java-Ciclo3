package mintic.grupo61.CovidCol.controlador;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mintic.grupo61.CovidCol.modelo.usuario.UsuarioServicio;
import mintic.grupo61.CovidCol.modelo.usuario.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controlador que manipula el flujo de los servicios rest del microservicio de animes.

@RestController
//@Controller
//@Slf4j
@RequestMapping("/vacunas")
public class Controlador {
    
    @Autowired
    private UsuarioServicio usuarioservicioImpl;
        //listar
	@GetMapping
	@RequestMapping(value = "consultarusuarios", method = RequestMethod.GET)
	public ResponseEntity<?> consultarUsuarios() {
		
		List<Usuarios> usuariosConsultados = this.usuarioservicioImpl.consultarUsuarios();
		
		return ResponseEntity.ok(usuariosConsultados);
	}
        //guardar
        @PostMapping
        @RequestMapping(value = "guardarusuarios", method = RequestMethod.POST)
	public ResponseEntity<?> guardarUsuario(@RequestBody Usuarios usuarios)
        {
            Usuarios Usuarioguardado = this.usuarioservicioImpl.guardarUsuario(usuarios);
            return ResponseEntity.status(HttpStatus.CREATED).body(Usuarioguardado);
        }
        
        //actualizar
        @PutMapping
        @RequestMapping(value = "actualizarusuarios", method = RequestMethod.PUT)
	public ResponseEntity<?> actualizarUsuario(@RequestBody Usuarios usuarios)
        {
            Usuarios Usuarioactualizado = this.usuarioservicioImpl.actualizarUsuario(usuarios);
            return ResponseEntity.status(HttpStatus.CREATED).body(Usuarioactualizado);
        }
        
        //eliminar
        @DeleteMapping
        @RequestMapping(value = "eliminarusuarios/{Idusuario}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarUsuario(@PathVariable Long Idusuario)
        {
            this.usuarioservicioImpl.eliminarUsuario(Idusuario);
            return ResponseEntity.ok().build();
        }

}
