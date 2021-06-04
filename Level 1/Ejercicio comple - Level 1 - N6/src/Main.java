import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa la base");
        int base = scan.nextInt();
        System.out.println("Ingresa la potencia");
        int pot = scan.nextInt();
        int resul=1;
        for(int i = 0; i < pot; i++){
            resul*=base;
        }
        System.out.println(base + " elevado a " + pot + " = " + resul);

    }
}
