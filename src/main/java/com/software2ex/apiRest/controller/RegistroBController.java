package com.software2ex.apiRest.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.software2ex.apiRest.model.RegistroB;

@RestController
@RequestMapping("/api/registroBcr")

public class RegistroBController {
    private List<RegistroB>registrosBcr;

    public RegistroBController(){
        try {
         ObjectMapper objectMapper = new ObjectMapper();
         RegistroB[] registrosBcrArray = objectMapper.readValue(new ClassPathResource("registrosBcr.json").getFile(), RegistroB[].class);
         registrosBcr = new ArrayList<>(Arrays.asList(registrosBcrArray));
        } catch (IOException e) {
            e.printStackTrace();
            registrosBcr = new ArrayList<>();
            
        }
    }
    @GetMapping
    public List<RegistroB> getAllRegistroBs(){
        return registrosBcr;
    }
     
    @GetMapping("/{idRegistro}")
    public RegistroB getRegistroBByidRegistroB(@PathVariable Long idRegistro){
        return registrosBcr.stream()
        .filter(registro -> registro.getIdRegistro().equals(idRegistro))
        .findFirst().orElse(null);
        
    }
    

    @PostMapping
    public RegistroB createRegistroB(@RequestBody RegistroB registroB) {
        registrosBcr.add(registroB);
        return registroB;
    }

    @PutMapping("/{idRegistro}")
    public RegistroB updateRegistroB(@PathVariable Long idRegistro, @RequestBody RegistroB updateRegistroB) {
        RegistroB registroB = getRegistroBByidRegistroB(idRegistro);
        if (registroB != null) {
            registroB.setCodVaca(updateRegistroB.getCodVaca());
            registroB.setCodBecerro(updateRegistroB.getCodBecerro());
            registroB.setNameVaca(updateRegistroB.getNameVaca());
            registroB.setNameBecerro(updateRegistroB.getNameBecerro());
            registroB.setFechaNacBecerro(updateRegistroB.getFechaNacBecerro());
            registroB.setSexoBecerro(updateRegistroB.getSexoBecerro());
            registroB.setRaza(updateRegistroB.getRaza());
            return registroB;
        }
        return null;
    }

    @DeleteMapping("/{idRegistro}")
    public void deleteRegistroB(@PathVariable Long idRegistro) {
    registrosBcr.removeIf(registro -> registro.getIdRegistro().equals(idRegistro));
    }
}
