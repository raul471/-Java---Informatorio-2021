
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> baraja = new ArrayList<String>();
        baraja.add("A");
        baraja.add("2");
        baraja.add("3");
        baraja.add("4");
        baraja.add("5");
        baraja.add("6");
        baraja.add("7");
        baraja.add("8");
        baraja.add("9");
        baraja.add("J");
        baraja.add("Q");
        baraja.add("K");

        System.out.println("Elementos de la baraja: ");
        Iterator<String> it = baraja.iterator();
        while (it.hasNext()) {
            System.out.printf(it.next());
        }
        System.out.println("");

        Collections.reverse(baraja);
        System.out.println("Elementos de la baraja inversa:");
        Iterator<String> itInv = baraja.iterator();
        while (itInv.hasNext()) {
            System.out.printf(itInv.next());
        }
        System.out.println("");
        Collections.shuffle(baraja);
        System.out.println("Elementos de la baraja mezclada:");
        Iterator<String> itMez = baraja.iterator();
        while (itMez.hasNext()) {
            System.out.printf(itMez.next());
        }





    }

}
