import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
        int num1 = scan.nextInt();
        int num2 = num1;
        int fact = 1;
        while(num1 !=0){
            fact *= num1;
            num1 --;
        }
        System.out.println("El factorial de " +num2+" es: "+fact);

    }
}
