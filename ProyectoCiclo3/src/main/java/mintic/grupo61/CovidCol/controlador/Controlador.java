package mintic.grupo61.CovidCol.controlador;

import javax.servlet.http.HttpServletRequest;
import mintic.grupo61.CovidCol.modelo.usuario.UsuarioInterface;
import mintic.grupo61.CovidCol.modelo.usuario.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Controlador que manipula el flujo de los servicios rest del microservicio de Covidcol.

@Controller

@RequestMapping("/")   // http:localhost:8080/
public class Controlador {
    private final Logger log = LoggerFactory.getLogger(Usuarios.class);
    @Autowired
    private UsuarioInterface usuarioInterface;
   
    //ingresar
    @GetMapping("")  //http:localhost:8080/
    public String ingresar()
    {
        return "index";
    }
    
    //usuariover
    @GetMapping("/usuarioactivo")
    public String usuariover(Model modelo)  //,@PathVariable String correo  
    {
         String mensaje = "Hola mundo con thymeleaf";
        //List<Usuarios> usuario = usuarioInterface.findBycorreoAndcontrsaeña(correo,contraseña);
        //log.info("Datos usuario,{}",usuario);
        
        //modelo.addAttribute("usuariounico",usuarioInterface.findBycorreo(correo));
        modelo.addAttribute ("mensaje", mensaje);
        return "usuarioactivo";    
    }
  
        
    //listar
    @GetMapping("/lista")
    public String listar(Model modelo)
    {
        modelo.addAttribute("lista", usuarioInterface.findAll());
        return "usuarios";
    }
        
    @GetMapping("/adicionar")  //http:localhost:8080/adicionar
    public String adiciona ()
    {         
        return "adicionar";
    }

    @PostMapping("/guardar")  
    public String guardar(Usuarios usuarios)
    {
        usuarioInterface.save(usuarios);
        return "redirect:/lista"; 
    }        
        
    
}    
       


