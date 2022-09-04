package mintic.grupo61.CovidCol.controlador;

import mintic.grupo61.CovidCol.modelo.usuario.UsuarioInterface;
import mintic.grupo61.CovidCol.modelo.usuario.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Controlador que manipula el flujo de los servicios rest del microservicio de Covidcol.

@Controller

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
        
        @GetMapping("/adicionar")  //http:localhost:8080/vacunas/adicionar
      	public String adiciona ()
        {         
            return "adicionar";
        }

        @PostMapping("/guardar")  
        public String guardar(Usuarios usuarios)
        {
            usuarioInterface.save(usuarios);
            return "redirect:/vacunas"; 
        }        
        
        
       


}
