import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> ciu = new ArrayList<String>();
        ciu.add("Resistencia");
        ciu.add("Corrientes");
        ciu.add("Posadas");
        for (int i=0; i<ciu.size();i++){
            System.out.println((i+1)+"#"+"-"+ciu.get(i));
        }

    }
}
