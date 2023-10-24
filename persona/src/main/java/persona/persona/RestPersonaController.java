package persona.persona;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestPersonaController {

    @GetMapping("/get")
    public void getPersonaList(){
        Persona Plist = new Persona(null,null,null);
        Plist.getPersonaList();
    }

    @PostMapping("/post")
    public void addPersona(String name, String age, String adress){
        Persona persona = new Persona(name,age,adress);
        persona.addPersona(persona);
        persona.getPersonaList();
    }

    @PutMapping("/edit")
    public void updatePersona(String name, String age, String adress, int index){
        Persona persona = new Persona(name,age,adress);
        persona.updatePersona(persona, index);
        persona.getPersonaList();
    }

    @DeleteMapping("/delete")
    public void delPersona(int index){
        Persona persona = new Persona(null, null, null);
        persona.getPersonaList();
        persona.delPersona(index);
        persona.getPersonaList();
    }
    
}
