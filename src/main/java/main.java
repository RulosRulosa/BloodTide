import java.util.Scanner;

public class main {



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
        int opcion= -1;
        switch (opcion){
            case 1:

                System.out.println("ingresa tu último periodo");
                System.out.println("ingresa un promedio de tu ciclo");
                //debería ir una interfaz que permita ingresar una fecha y un número

                break;
            case 2:

                System.out.println("bienvenida de nuevo a bloodtide");
                //aquí debería ir una interfaz que muestre la fecha del próximo periodo
                // y la fecha de la próxima ovulación.

                break;
            case 0:
                System.out.println("adiós");
                break;
            default:

        }

    }


}