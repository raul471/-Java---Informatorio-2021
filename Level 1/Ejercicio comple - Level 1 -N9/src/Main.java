import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa una frase en minusculas");
        String frase = scan.nextLine();
        System.out.println("Ingresa una letra que aparezca en la frase");
        char letra = scan.next().charAt(0);
        int cont =0;
        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == letra){
                cont++;
            }
        }


        System.out.println("La letra aparece " + cont + " veces");

    }
}