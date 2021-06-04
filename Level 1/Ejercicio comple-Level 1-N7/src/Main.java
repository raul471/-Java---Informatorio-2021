import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ingrese una palabra en minuscula: ");
        Scanner scan = new Scanner(System.in);
        String palabra = scan.nextLine();
        String palabraMayuscula = "";
        for(int i = 0; i < palabra.length(); i++){
            palabraMayuscula += minusaMayus(palabra.charAt(i));
        }
        System.out.println(palabraMayuscula);
    }

    public static char minusaMayus(char c){
        switch(c){
            case 'a':
                return 'A';
            case 'b':
                return 'B';
            case 'c':
                return 'C';
            case 'd':
                return 'D';
            case 'e':
                return 'E';
            case 'f':
                return 'F';
            case 'g':
                return 'G';
            case 'h':
                return 'H';
            case 'i':
                return 'I';
            case 'j':
                return 'J';
            case 'k':
                return 'K';
            case 'm':
                return 'M';
            case 'n':
                return 'N';
            case 'l':
                return 'L';
            case 'o':
                return 'O';
            case 'p':
                return 'P';
            case 'q':
                return 'Q';
            case 'r':
                return 'R';
            case 's':
                return 'S';
            case 't':
                return 'T';
            case 'u':
                return 'U';
            case 'v':
                return 'V';
            case 'w':
                return 'W';
            case 'x':
                return 'X';
            case 'y':
                return 'Y';
            case 'z':
                return 'Z';
            default:
                return c;
        }
    }
}
