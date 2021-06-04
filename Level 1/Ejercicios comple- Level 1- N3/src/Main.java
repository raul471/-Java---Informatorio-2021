import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa 1 numero entero");
        int num1 = scan.nextInt();
        for(int i=1; i<=num1; i++){
            System.out.println("");
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
        }
        System.out.println("");

    }
}
