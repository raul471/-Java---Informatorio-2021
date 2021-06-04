import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(40, 500, "Emple1", "Apell1", "00000001");
        Empleado emp2 = new Empleado(40, 600, "Emple2", "Apell2", "00000002");
        Empleado emp3 = new Empleado(45, 600, "Emple3", "Apell3", "00000003");
        Empleado emp4 = new Empleado(44, 500, "Emple4", "Apell4", "00000004");
        Empleado emp5 = new Empleado(44, 600, "Emple5", "Apell5", "00000005");

        Set<Empleado> empleados = new HashSet<Empleado>(){{
            add(emp1);
            add(emp2);
            add(emp3);
            add(emp4);
            add(emp5);
        }};
        Map<String, Integer> sueldos = new HashMap<>();

        for(Empleado e : empleados){
            sueldos.put(e.DNI, (e.hTrabajadas*e.vPHora));
        }

        System.out.println(sueldos.get(emp3.DNI));


    }


}

