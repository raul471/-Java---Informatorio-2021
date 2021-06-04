
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> estu = new ArrayList<String>();
        List<String> cur1 = new ArrayList<String>();
        List<String> cur2 = new ArrayList<String>();
        List<String> cur3 = new ArrayList<String>();

        estu.add("Nombre1");
        estu.add("Nombre2");
        estu.add("Nombre3");
        estu.add("Nombre4");
        estu.add("Nombre5");
        estu.add("Nombre6");
        estu.add("Nombre7");
        estu.add("Nombre8");
        estu.add("Nombre9");
        estu.add("Nombre10");
        estu.add("Nombre11");
        estu.add("Nombre12");

        cur1 = estu.subList(0,4);
        cur2 = estu.subList(4,8);
        cur3 = estu.subList(8,12);

        System.out.println("El curso N1: ");
        Iterator<String> it = cur1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("");

        System.out.println("El curso N2:");
        Iterator<String> it2 = cur2.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        System.out.println("");

        System.out.println("El curso N3:");
        Iterator<String> it3 = cur3.iterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }


    }

}

