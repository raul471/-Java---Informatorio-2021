import java.util.ArrayList;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> htrabajadas = new ArrayList<Integer>();
        ArrayList<Integer> vporhora = new ArrayList<Integer>();
        ArrayList<Integer> sueldo = new ArrayList<Integer>();

        htrabajadas.add(8);
        htrabajadas.add(8);
        htrabajadas.add(8);
        htrabajadas.add(9);
        htrabajadas.add(9);
        vporhora.add(100);
        vporhora.add(100);
        vporhora.add(130);
        vporhora.add(150);
        vporhora.add(150);

        for(int i = 0; i < htrabajadas.size(); i++){
            sueldo.add(htrabajadas.get(i) * vporhora.get(i));
        }
        System.out.println("El sueldo por dia es:");
        Iterator<Integer> it = sueldo.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        int sueldoTotal = 0;
        for(int i = 0; i < sueldo.size(); i++){
            sueldoTotal+=sueldo.get(i);
        }
        System.out.println("El sueldo de la semana es : " + sueldoTotal);

    }
}


