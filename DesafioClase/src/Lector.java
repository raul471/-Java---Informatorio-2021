import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Lector {


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
            } /*Muesta la lista completa*/

        }
        System.out.println("Ingresa la letra en Mayuscula con la que queres filtar: ");
        Scanner scan = new Scanner(System.in) ;
        String letra = scan.nextLine();
        empleados.stream()
                .filter(x -> x.nombre.startsWith(letra))
                .collect(Collectors.toList()).forEach(System.out::println); /*Filtra los empleados con la letra ingresada*/

        System.out.println("Empleados mas Viejo y mas Joves: ");
        filtroEdad(empleados);
        System.out.println("Empleados que Gana y memos Gana: ");
        filtroSueldo(empleados);

}

    public static void filtroEdad(List<Empleado> listaDeEmpleados) {

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

    public static void filtroSueldo(List<Empleado> listaDeEmpleados) {
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
    public String toString(){
        return this.nombre;
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