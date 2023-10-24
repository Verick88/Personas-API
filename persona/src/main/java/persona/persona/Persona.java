package persona.persona;

import java.util.List;
import java.util.ArrayList;

public class Persona {
    private String name;
    private String age;
    private String adress;

    List<Persona> Plist = new ArrayList<Persona> ();

    public Persona(String name, String age, String adress){
        this.name = name;
        this.age = age;
        this.adress = adress;
    }


    public void getPersonaList(){
        Persona persona1 = new Persona("Jorge","21","Heredia");
        Persona persona2 = new Persona("Carlos","25","Alajuela");
        Persona persona3 = new Persona("Rafael","22","Guanacaste");

        Plist.add(persona1);
        Plist.add(persona2);
        Plist.add(persona3);

        for(Persona personaIteracion : Plist){
            System.out.println(personaIteracion.getName());
        }
    }

    /*AGREGA UNA PERSONA A LA LISTA */
    public void addPersona(Persona persona){
        Plist.add(persona);
    }

    /*ACTUALIZA UNA PERSONA */
    public void updatePersona(Persona persona, int index){
        this.getPersonaList();
        Plist.set(index, persona);
    }

    /*BORRA UNA PERSONA */
    public void delPersona(int index){
        Plist.remove(index);
    }

    /*GETTERS AND SETTERS PARA LA CLASE */
    public String getName() {
        return name;
    }

    public String getAge(){
        return age;
    }

    public String getAdress(){
        return adress;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(String age){
        this.age = age;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }

}
