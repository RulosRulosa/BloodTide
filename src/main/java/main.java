import java.util.Scanner;

public class main {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        bienvenida();
        menu();

    }

    public static void bienvenida () {
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*          bienvenida         *");
        System.out.println("*                             *");
        System.out.println("*******************************");
    }

    public static void menu(){
        System.out.println("¿eres nueva?");
        System.out.println("presiona 1 si eres nueva, presiona 2 para ver tu calendario, presiona 0 para salir");
        menuaccion();
    }

    public static void menuaccion(){

        int opcion= teclado.nextInt();
        switch (opcion){
            case 1:
                ingresarpromedio();
                ingresarultimafecha();
                //debería ir una interfaz que permita ingresar una fecha y un número
                break;
            case 2:
                System.out.println("bienvenida de nuevo a bloodtide");
                //aquí debería ir una interfaz que muestre la fecha del próximo periodo
                // y la fecha de la próxima ovulación.
                break;
            case 0:
                System.out.println("adiós");
                //se debiera cerrar la aplicación
                break;
            default:
                System.out.println("no es una opción válida");
                break;

        }

    }
    public static void ingresarpromedio(){

        System.out.println("ingresa un promedio de tu ciclo");
        int promciclo= teclado.nextInt();
        System.out.println("el promedio que ingresaste es "+promciclo);
    }
    public static void ingresarultimafecha(){

        System.out.println("ingresa tu último periodo");
        System.out.println("ingresa el día:");
        String diaultimoperiodo= teclado.next();
        System.out.println("ingresa el mes");
        String mesutlimoperiodo= teclado.next();
        System.out.println("el útlimo periodo que ingresaste es: "+diaultimoperiodo+" de "+mesutlimoperiodo);
    }


}