
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList <Integer> num = new LinkedList<Integer>();
        num.add(9);
        num.add(8);
        num.add(7);
        num.add(6);
        num.add(5);
        for (int i=0; i<num.size();i++){
            System.out.println("Posición"+(i+1)+"-"+num.get(i));
        }
        System.out.println("El tamaño de la lista es " + num.size());
        num.addFirst(10);
        num.addLast(4);
        for (int i=0; i<num.size();i++){
            System.out.println("Posición"+(i+1)+"-"+num.get(i));
        }
        System.out.println("El tamaño de la lista es " + num.size());

    }
}
