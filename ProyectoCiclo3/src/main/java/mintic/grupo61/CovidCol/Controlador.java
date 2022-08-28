package mintic.grupo61.CovidCol;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@Slf4j
public class Controlador {
    
    @GetMapping("/")
   
    public String inicio()
    {
        log.info("Desde Controlador");
        //log.debug("Mas Informacion");
        return "index";
    }        
    
}
