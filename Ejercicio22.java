import java.util.Scanner;

public class Ejercicio22
{
    public static void main(String[] args)
    {
        String nombreEmpleado;
        double salarioHora, horasAlMes;

        var MONTO_TOPE = 450000;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        nombreEmpleado = scanner.next();

        System.out.print("Ingrese el salario por hora: ");
        salarioHora = scanner.nextDouble();

        System.out.print("Ingrese las horas trabajadas al mes: ");
        horasAlMes = scanner.nextDouble();

        var salarioMensual = salarioHora * horasAlMes;   // para hallar el salario mensual

        if (salarioMensual > MONTO_TOPE)
        {              // compara el salario mensual con el monto tope
            System.out.println(nombreEmpleado);
            System.out.println(salarioMensual);
        }
        else
        {
            System.out.println(nombreEmpleado);
        }
    }
}
