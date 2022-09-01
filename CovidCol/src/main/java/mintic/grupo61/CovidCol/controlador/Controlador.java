package mintic.grupo61.CovidCol.controlador;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mintic.grupo61.CovidCol.modelo.usuario.UsuarioServicio;
import mintic.grupo61.CovidCol.modelo.usuario.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

	@GetMapping
	@RequestMapping(value = "consultarusuarios", method = RequestMethod.GET)
	public ResponseEntity<?> consultarUsuarios() {
		
		List<Usuarios> usuariosConsultados = this.usuarioservicioImpl.consultarUsuarios();
		
		return ResponseEntity.ok(usuariosConsultados);
	}
}
