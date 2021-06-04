import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(fizzBuzz(1,6));

    }

    private static List<String> fizzBuzz(int num1, int num2) {

        List<String> listaNum = new ArrayList<>();

        for (int i = num1; i < num2 ; ++i) {

            String ArrStrig = String.valueOf(i); //convierte a cadenas
            if (i%2 == 0 && i%3 == 0 ) {

                ArrStrig = "FizzBazz";

            }

            else if (i%2 == 0) {

                ArrStrig = "Fizz";
            }

            else if ( i%3 == 0) {

                ArrStrig = "Buzz";
            }

            listaNum.add(ArrStrig);

        }

        return listaNum;

    }
}
