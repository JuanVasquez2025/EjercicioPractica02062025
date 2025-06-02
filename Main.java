import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
        String continuar;

        do {
            System.out.println("\n***** Ingrese los datos del empleado *****");

            System.out.print("Ingrese ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            System.out.print("Ingrese Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Ingrese Departamento: ");
            String departamento = scanner.nextLine();

            System.out.print("Ingrese Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            empleados.add(new Empleado(id, nombre, apellido, departamento, salario));
            System.out.println("\nEmpleado agregado exitosamente.");

            System.out.print("¿Desea agregar otro empleado? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        // Mostrar todos los empleados al finalizar
        System.out.println("\n***** Lista completa de empleados *****");
        System.out.println("--------------------------------------");
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            System.out.println("ID: " + empleado.getId() +
                               ", Nombre: " + empleado.getNombre() +
                               ", Apellido: " + empleado.getApellido() +
                               ", Departamento: " + empleado.getDepartamento() +
                               ", Salario: " + empleado.getSalario());
        }
        scanner.close();
    }
}