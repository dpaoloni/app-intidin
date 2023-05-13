
package com.porfolio.persona.controller;

import com.porfolio.persona.model.Persona;
import com.porfolio.persona.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;


@RestController 
public class Controller {
    @Autowired IPersonaService IpersonaService;

@PostMapping("/new/persona")
public String newPersona (@RequestBody Persona persona){
IpersonaService.savePersona(persona);
return "Persona creada conExito";
}

@GetMapping("/ver/persona")
@ResponseBody
public List <Persona> verPersona(){
return IpersonaService.getPersona();
}

@DeleteMapping ("/delete/{id}")
public void deletePersona(@PathVariable Long id){
IpersonaService.deletePersona(id);
}


    @PutMapping("/edit/persona/{id}")
    public Persona editPersona (@PathVariable Long id,
                                @RequestParam("nombre") String nuevoNombre,
                                @RequestParam("apellido") String nuevoApellido){
        Persona persona=IpersonaService.findPersona(id);

        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);

    IpersonaService.savePersona(persona);
    return persona;
 }
}