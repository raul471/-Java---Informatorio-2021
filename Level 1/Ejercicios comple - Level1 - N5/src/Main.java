import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa 2 numeros enteros");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int mult = num1*num2;

        System.out.println(num1+"x"+num2+"="+mult);

    }
}
