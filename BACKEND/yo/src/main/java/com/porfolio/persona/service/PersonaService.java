
package com.porfolio.persona.service;
import com.porfolio.persona.model.Persona;
import com.porfolio.persona.repository.PersonaRepository;
import jakarta.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class PersonaService implements IPersonaService {
    @Autowired PersonaRepository personaRepository;

    @Override
    public List <Persona> getPersona() {
    List<Persona> persona = personaRepository.findAll();
     return  persona; 
    }

    @Override
    public void savePersona(Persona persona) {
      personaRepository.save(persona); 
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id); 
    }

    @Override
    public Persona findPersona(@PathVariable Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona findPersona(SingularAttribute<AbstractPersistable, Serializable> id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }


}
