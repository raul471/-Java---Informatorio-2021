import java.util.Scanner;

public class OperacionesArit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa 2 numeros enteros");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int suma = num1+num2;
        int resta = num1-num2;
        int mult = num1*num2;
        int div = num1/num2;
        int modulo = num1%num2;

        System.out.println("La suma es "+suma);
        System.out.println("La resta es "+resta);
        System.out.println("La multiplicación es "+mult);
        System.out.println("La division es "+div);
        System.out.println("El modulo es "+modulo);
    }
}

