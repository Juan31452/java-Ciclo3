package mintic.grupo61.CovidCol.controlador;

import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import mintic.grupo61.CovidCol.modelo.usuario.UsuarioInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Controlador que manipula el flujo de los servicios rest del microservicio de Covidcol.

@Controller
@Slf4j
@RequestMapping("/vacunas")   // http:localhost:8080/vacunas
public class Controlador {
    
    @Autowired
    private UsuarioInterface usuarioInterface;
        //listar
	@GetMapping("")
        //@RequestMapping(value = "consultarusuarios", method = RequestMethod.GET)
	public String listar(Model modelo)
        {
            modelo.addAttribute("lista", usuarioInterface.findAll());
            return "usuarios";
        }
        // //guardar
        // @PostMapping
        // @RequestMapping(value = "guardarusuarios", method = RequestMethod.POST)
	// public ResponseEntity<?> guardarUsuario(@RequestBody Usuarios usuarios)
        // {
        //     Usuarios Usuarioguardado = this.usuarioservicioImpl.guardarUsuario(usuarios);
        //     return ResponseEntity.status(HttpStatus.CREATED).body(Usuarioguardado);
        // }
        
        // //actualizar
        // @PutMapping
        // @RequestMapping(value = "actualizarusuarios", method = RequestMethod.PUT)
	// public ResponseEntity<?> actualizarUsuario(@RequestBody Usuarios usuarios)
        // {
        //     Usuarios Usuarioactualizado = this.usuarioservicioImpl.actualizarUsuario(usuarios);
        //     return ResponseEntity.status(HttpStatus.CREATED).body(Usuarioactualizado);
        // }
        
        // //eliminar
        // @DeleteMapping
        // @RequestMapping(value = "eliminarusuarios/{Idusuario}", method = RequestMethod.DELETE)
	// public ResponseEntity<?> eliminarUsuario(@PathVariable Long Idusuario)
        // {
        //     this.usuarioservicioImpl.eliminarUsuario(Idusuario);
        //     return ResponseEntity.ok().build();
        // }

        // //buscar
        // @GetMapping
        // @RequestMapping(value = "buscarusuario/{Idusuario}", method = RequestMethod.GET)
	// public ResponseEntity<?> buscarid(@PathVariable Long Idusuario)
        // {
        //      Usuarios usuarioconsulta = this.usuarioservicioImpl.buscarid(Idusuario);
        //     return ResponseEntity.ok(usuarioconsulta);
        // }
        
        // //buscar por npasaporte
        // @GetMapping
        // @RequestMapping(value = "buscarpasaporte/{npasaporte}", method = RequestMethod.GET)
	// public ResponseEntity<?> buscarporpasaporte(@PathVariable String npasaporte)
        // {
        //      Optional<Usuarios> consultapasaporte = this.usuarioservicioImpl.buscarporpasaporte(npasaporte);
        //     return ResponseEntity.ok(consultapasaporte);
        // }


}
