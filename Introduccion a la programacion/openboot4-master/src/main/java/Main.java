public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;
        if (numeroIf == 0) {
            System.out.println(numeroIf + " es 0");
        } else if (numeroIf < 0) {
            System.out.println(numeroIf + " es negativo");
        } else {
            System.out.println(numeroIf + " es positivo");
        }
        System.out.println("------------------------------------------------------------------------------------");
        int numeroWhile=0;
        while (numeroWhile< 3){
            System.out.println(numeroWhile);
            numeroWhile= numeroWhile +1;}
        System.out.println("-------------------------------------------------------------------------------");
        int contador=0;
        do {
            System.out.println(contador);
            contador= contador +1;
        }while( contador <3);
        System.out.println("------------------------------------------------------------------------------------");


        for ( int numeroFor = 0; numeroFor<= 3; numeroFor= numeroFor +1) {
            System.out.println(numeroFor);}

        System.out.println("------------------------------------------------------------------------------------");

        var estacion = "PRIMAVERA";
        switch (estacion){
            case "PRIMAVERA":
            System.out.println("es primavera");
            break;
            case "VERANO":
                System.out.println("es verano");
                break;
            case "OTOÑO":
                System.out.println("es otoño");
                break;
            case " INVIERNO":
                System.out.println("es invierno");
                break;
            default:
                System.out.println("no es una estacion");


        }


    }

}