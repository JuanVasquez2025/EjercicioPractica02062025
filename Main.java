import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
//Una vez que el usuario decida detener la carga de datos el programa
//deberá mostrar los empleados registrados, haciendo uso de la clase
//Iterator.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
        String continuar;

        do {
            System.out.print("Ingrese ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Ingrese Departamento: ");
            String departamento = scanner.nextLine();

            System.out.print("Ingrese Salario: ");
            double salario = scanner.nextDouble();

            Empleado empleado = new Empleado(id, nombre, apellido, departamento, salario);
            empleados.add(empleado);
            
            System.out.println("\nEmpleados ingresados hasta ahora:");
            Iterator<Empleado> iterator = empleados.iterator();

            while (iterator.hasNext()) {
                Empleado emp = iterator.next();
                System.out.println(
                        "ID: " + emp.getId() + ", Nombre: " + emp.getNombre() + ", Apellido: " + emp.getApellido() +
                                ", Departamento: " + emp.getDepartamento() + ", Salario: " + emp.getSalario());

            }
            System.out.print("¿Desea agregar otro empleado? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

    }
}
