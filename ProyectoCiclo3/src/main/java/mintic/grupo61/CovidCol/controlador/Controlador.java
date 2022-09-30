package mintic.grupo61.CovidCol.controlador;

import java.util.List;
import mintic.grupo61.CovidCol.modelo.casos.casosRepository;
import mintic.grupo61.CovidCol.modelo.ciudad.Ciudad;
import mintic.grupo61.CovidCol.modelo.usuario.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import mintic.grupo61.CovidCol.servicios.UsuarioImpl;
import mintic.grupo61.CovidCol.servicios.CiudadImpl;
import org.springframework.web.bind.annotation.PathVariable;

//Controlador que manipula el flujo de los servicios rest del microservicio de Covidcol.

@Controller

@RequestMapping("/") // http:localhost:8080/
public class Controlador {

    // @Autowired
    // private UsuarioRepository usuarioInterface;
     @Autowired
     private casosRepository casosRepository;

    @Autowired
    private UsuarioImpl usuarioImpl;

    @Autowired
    private CiudadImpl ciudadImpl;

    // ingresar
    @GetMapping("") // http:localhost:8080/
    public String ingresar() {
        return "index";
    }

    // usuariover
    @PostMapping("/usuariover")
    public String usuariover(String correo, String contraseña, Model modelo) // ,@PathVariable String correo
    {
        //String mensaje = "Hola mundo con thymeleaf";
        String mensaje1 = "Usuario o clave invalidad";

        //modelo.addAttribute("mensaje", mensaje);
        //modelo.addAttribute("correo", correo);

        List<Usuarios> milista1 = usuarioImpl.buscarusuario(correo, contraseña);

        if (milista1.size() >= 1) {

            Long id = milista1.get(0).getIdusuario();
            modelo.addAttribute("id", id);
            modelo.addAttribute("lista1", milista1);
            return "usuarioactivo";
        } else {
            modelo.addAttribute("mensaje1", mensaje1);
            return "index";

        }
    }

    // listar
    @GetMapping("/lista") // http:localhost:8080/lista
    public String listar(Model modelo) {
        modelo.addAttribute("lista", usuarioImpl.Todos());
        return "usuarios";
    }

    @GetMapping("/adicionar") // http:localhost:8080/adicionar
    public String adiciona() {
        return "adicionar";
    }

    @PostMapping("/guardar")
    public String guardar(Usuarios usuarios, Model modelo) {
        String mensaje2 = "Usuario Registrado, ingrese con su correo y contraseña";

        usuarioImpl.guardarusuario(usuarios);
        modelo.addAttribute("mensaje1", mensaje2);
        return "index";
    }

    @PostMapping("/guardarciudad")
    public String guardarciudad(Ciudad ciudad) {
        ciudadImpl.guardarciudad(ciudad);
        return "redirect:/listaciudad";

    }

    // listar
    @GetMapping("/listaciudad") // http:localhost:8080/listaciudad
    public String listarciudad(Model modelo) {
        
        String estado = "Leve";
        String estado1 = "Fallecido";
        String estado2 = "Recuperado";
        String ciudad1 = "Bogota";
        String ciudad2 = "Cali";
        String ciudad3 = "Medellin";
        String ciudad4 = "Pasto";
        String ciudad5 = "Cartagena";
        
        long caso1 = casosRepository.countByestado(estado);
        long caso2 = casosRepository.countByestado(estado1);
        long recuperados = casosRepository.countByrecuperado(estado2);
        long casociudad = casosRepository.casosciudad();
        long casociudad1 = casosRepository.casosciudad1();
        long casociudad2 = casosRepository.casosciudad2();
        long casociudad3 = casosRepository.casosciudad3();
        long casociudad4 = casosRepository.casosciudad4();
        
        long confirmados = casosRepository.count();
        long activos = confirmados - recuperados;
        modelo.addAttribute("casociudad", casociudad );
        modelo.addAttribute("casociudad1", casociudad1 );
        modelo.addAttribute("casociudad2", casociudad2 );
        modelo.addAttribute("casociudad3", casociudad3 );
        modelo.addAttribute("casociudad4", casociudad4 );      
        modelo.addAttribute("ciudad1", ciudad1 );
        modelo.addAttribute("ciudad2", ciudad2 );
        modelo.addAttribute("ciudad3", ciudad3 );
        modelo.addAttribute("ciudad4", ciudad4 );
        modelo.addAttribute("ciudad5", ciudad5 );       
        modelo.addAttribute("activos", activos);
        modelo.addAttribute("confirmados", confirmados);
        modelo.addAttribute("fallecidos", caso2);
        modelo.addAttribute("recuperado", recuperados );
        
        modelo.addAttribute("listaciudad", ciudadImpl.buscarultimo());

        return "ciudad";
    }

    // listarTodosUsuarios
    // @GetMapping("/listausuarios")//http:localhost:8080/listaciudad
    // public String listausuarios(Model modelo)
    // {
    // modelo.addAttribute("listausuarios", usuarioImpl.consultausuario1());
    // return "listausuarios";
    // }
    
    // casos
    @GetMapping("/activos") // http:localhost:8080/activos
    public String activos (Model modelo) {
        String estado = "Leve";
        String estado1 = "Fallecido";
        String estado2 = "Recuperado";
        String ciudad1 = "Bogota";
        String ciudad2 = "Cali";
        String ciudad3 = "Medellin";
        String ciudad4 = "Pasto";
        String ciudad5 = "Cartagena";
        
        long caso1 = casosRepository.countByestado(estado);
        long caso2 = casosRepository.countByestado(estado1);
        long recuperados = casosRepository.countByrecuperado(estado2);
        long casociudad = casosRepository.casosciudad();
        long casociudad1 = casosRepository.casosciudad1();
        long casociudad2 = casosRepository.casosciudad2();
        long casociudad3 = casosRepository.casosciudad3();
        long casociudad4 = casosRepository.casosciudad4();
        
        long confirmados = casosRepository.count();
        long activos = confirmados - recuperados;
        modelo.addAttribute("casociudad", casociudad );
        modelo.addAttribute("casociudad1", casociudad1 );
        modelo.addAttribute("casociudad2", casociudad2 );
        modelo.addAttribute("casociudad3", casociudad3 );
        modelo.addAttribute("casociudad4", casociudad4 );      
        modelo.addAttribute("ciudad1", ciudad1 );
        modelo.addAttribute("ciudad2", ciudad2 );
        modelo.addAttribute("ciudad3", ciudad3 );
        modelo.addAttribute("ciudad4", ciudad4 );
        modelo.addAttribute("ciudad5", ciudad5 );       
        modelo.addAttribute("activos", activos);
        modelo.addAttribute("confirmados", confirmados);
        modelo.addAttribute("fallecidos", caso2);
        modelo.addAttribute("recuperado", recuperados );
        
        return "ciudad";
    }
    
    
    // editar
    @GetMapping("/editarusuario/{id}") // http:localhost:8080/
    public String editar(@PathVariable("id") Long Id ,Model modelo) {
    //     Usuarios usuarios = usuarioImpl.findByIdusuario(Id);
        long miid = Id;
        List<Usuarios> milista = usuarioImpl.editarusuario(Id);
        

        modelo.addAttribute("editar", milista );
        modelo.addAttribute("id", miid );
        return "editarusuario";
    }


}
