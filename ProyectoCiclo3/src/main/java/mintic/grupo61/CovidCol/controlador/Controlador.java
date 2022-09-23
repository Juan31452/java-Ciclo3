package mintic.grupo61.CovidCol.controlador;

import java.util.List;
import mintic.grupo61.CovidCol.modelo.ciudad.Ciudad;
import mintic.grupo61.CovidCol.modelo.ciudad.CiudadInterface;
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

@RequestMapping("/")   // http:localhost:8080/
public class Controlador {
    
    @Autowired
    private UsuarioInterface usuarioInterface;
    @Autowired
    private CiudadInterface ciudadInterface;
    
    //ingresar
    @GetMapping("")  //http:localhost:8080/
    public String ingresar()
    {
        return "index";
    }
    
    //usuariover
    @PostMapping("/usuariover")
    public String usuariover(String correo ,String contraseña , Model modelo  )  //,@PathVariable String correo  
    {
         String mensaje = "Hola mundo con thymeleaf";
         String mensaje1="Usuario o clave invalidad";
        
        modelo.addAttribute ("mensaje", mensaje);
        modelo.addAttribute ("correo", correo);
        
     List<Usuarios> milista1 = usuarioInterface.consultausuario(correo, contraseña);
        
        if (milista1.size() >=1) 
        {
                      
            Long id = milista1.get(0).getIdusuario(); 
            modelo.addAttribute ("id", id);
            modelo.addAttribute ("lista1", milista1);
            return "usuarioactivo";     
        }else
        {
              modelo.addAttribute ("mensaje1", mensaje1);
              return "index";
             
        }    
    }

    
        
    //listar
    @GetMapping("/lista")//http:localhost:8080/lista
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
    
    
    @PostMapping("/guardarciudad")  
    public String guardarciudad(Ciudad ciudad)
    {
        ciudadInterface.save(ciudad);
        return "redirect:/listaciudad"; 
    }
        
    //listar
    @GetMapping("/listaciudad")//http:localhost:8080/listaciudad
    public String listarciudad(Model modelo)
    {
        modelo.addAttribute("listaciudad", ciudadInterface.ultimoviaje());
        return "ciudad";
    }
    
    //listarTodosUsuarios
    @GetMapping("/listausuarios")//http:localhost:8080/listaciudad
    public String listausuarios(Model modelo)
    {
        modelo.addAttribute("listausuarios", usuarioInterface.consultausuario1());
        return "listausuarios";
    }
    
}    
       


