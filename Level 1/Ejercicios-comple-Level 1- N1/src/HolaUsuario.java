import java.util.Scanner;

public class HolaUsuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = scan.nextLine();
        System.out.println( "Hola: " +nombre);
    }
}
