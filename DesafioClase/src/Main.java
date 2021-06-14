import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    private static Empleado[] listaDeEmpeleados;

    public static void main(String[] args) throws IOException {
        String path = "D:\\Escritorio\\Informatorio\\Desafios\\Empleados.txt";
        List<Empleado> empleados = new ArrayList<>();

        try (BufferedReader miBuffer = new BufferedReader(new FileReader(path))) {
            String linea = miBuffer.readLine();
            while (linea != null) {
                String[] datosempleado = linea.split(","); /*Para separar el txt y crear el arreglo*/
                BigDecimal sueldo = new BigDecimal(datosempleado[3]);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate nac = LocalDate.parse(datosempleado[2], formatter);
                empleados.add(new Empleado(datosempleado[0],datosempleado[1],nac,sueldo));
                linea = miBuffer.readLine();
            }
            for (Empleado emp : empleados) {
                System.out.println(emp.nombre+" - "+emp.apellido+" - "+emp.nac+" - "+emp.sueldo);
            }

        }
        /*List<Empleado> empiezaCon = filtroEmpleados(empleados, "R");

        for (Empleado emp : empiezaCon) {
            System.out.println(emp.nombre + " - " + emp.apellido + " - " + emp.nac + " - " + emp.sueldo);
        }*/

        masJovenYViejo(empleados);
        mayorYMenorSueldo(empleados);

    }

    public static List<Empleado> filtroEmpleados(List<Empleado> listaDeEmpleados, String letraComienzo) {
        List<Empleado> list= new ArrayList<>();
        for (Empleado emp : listaDeEmpeleados) {
            if (emp.apellido.startsWith(letraComienzo)) {
                list.add(emp);
            }
        }
        return list;
    }

    public static void masJovenYViejo(List<Empleado> listaDeEmpleados) {

        Empleado masJoven = listaDeEmpleados
                .stream()
                .min(Comparator.comparing(Empleado::getEdad))
                .orElseThrow(NoSuchElementException::new);

        Empleado masViejo = listaDeEmpleados
                .stream()
                .max(Comparator.comparing(Empleado::getEdad))
                .orElseThrow(NoSuchElementException::new);

        System.out.println(masViejo.nombre+" - "+masViejo.getEdad());
        System.out.println(masJoven.nombre+" - "+masJoven.getEdad());

    }

    public static void mayorYMenorSueldo(List<Empleado> listaDeEmpleados) {
        Empleado mayorSueldo = listaDeEmpleados.stream().max(Comparator.comparing(Empleado::getSueldo)).orElseThrow(NoSuchElementException::new);
        Empleado menorSueldo = listaDeEmpleados.stream().min(Comparator.comparing(Empleado::getSueldo)).orElseThrow(NoSuchElementException::new);

        System.out.println(mayorSueldo.nombre+" - "+mayorSueldo.getSueldo());
        System.out.println(menorSueldo.nombre+" - "+menorSueldo.getSueldo());

    }

}

class Empleado {
    LocalDate nac;
    String nombre;
    String apellido;
    BigDecimal sueldo;


    public Empleado( String nombre, String apellido, LocalDate nac, BigDecimal sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nac = nac;
        this.sueldo = sueldo;


    }
    public int getEdad() {
        int edad = LocalDate.now().getYear() - this.nac.getYear();
        return edad;
    }

    public BigDecimal getSueldo() {
        BigDecimal sueldo = this.sueldo;
        return sueldo;
    }
}