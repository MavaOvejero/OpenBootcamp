public class Main {
    public static void main(String[] args) {
        int num1=24;
        int num2=36;
        int num3=40;
        Operacion addiction= new Operacion();
        System.out.println(addiction.suma(num1,num2,num3));

        Coche MiCoche= new Coche();
        System.out.println(MiCoche.puertas);
        MiCoche.agregarPuerta();
        System.out.println(MiCoche.puertas);
    }

}
