import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa Nombre y Apellido");
        String NyA = scan.nextLine();
        System.out.println("Ingresa tu dirección");
        String dire = scan.nextLine();
        System.out.println("Ingresa tu ciudad");
        String cuid = scan.nextLine();
        System.out.println("Ingresa tu edad");
        int Edad = scan.nextInt();

        System.out.println(cuid+"-"+dire+"-"+Edad+"-"+NyA);

    }
}