
package com.porfolio.persona.repository;

import com.porfolio.persona.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{

    public Object findById(PathVariable id);
 }
