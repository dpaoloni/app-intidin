
package com.porfolio.persona.service;

import com.porfolio.persona.model.Persona;
import jakarta.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.domain.AbstractPersistable;


public interface IPersonaService {
   public List <Persona> getPersona(); 
   public void savePersona (Persona persona);
   public void deletePersona (Long id);
   public Persona findPersona (java.lang.Long id);

    public Persona findPersona(SingularAttribute<AbstractPersistable, Serializable> id);
}
