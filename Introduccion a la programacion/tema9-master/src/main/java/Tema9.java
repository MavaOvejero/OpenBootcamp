public class Tema9 {
    public static void main(String[] args){
Cliente cliente = new Cliente();
cliente.nombre = "Lucas";
        System.out.println(cliente.nombre);
cliente.edad = 22;
        System.out.println(cliente.edad);
cliente.telefono = 1156779085;
        System.out.println(cliente.telefono);
cliente.credito = "Santander";
        System.out.println(cliente.credito);
        System.out.println("---------------------------------------------------------------");

Trabajador trabajador= new Trabajador();
trabajador.nombre="pablo";
        System.out.println(trabajador.nombre);

        trabajador.edad = 40;
        System.out.println(trabajador.edad);
        trabajador.telefono = 123456768;
        System.out.println(trabajador.telefono);
        trabajador.salario = 100000;
        System.out.println(trabajador.salario);


    }
}

class Persona{
int edad;
String nombre;
int telefono;

}
class Cliente extends Persona{
    String credito;
}
class Trabajador extends Persona{
    int salario;
}