import java.security.PrivateKey;

public class Main {
    public static void main(String[] args) {
        Persona persona= new Persona();
        persona.setNombre("Micaela");
        persona.setEdad("35");
        persona.setTelefono("123156463");
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());
    }

}
