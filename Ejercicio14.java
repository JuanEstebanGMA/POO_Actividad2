import java.util.Scanner;

public class Ejercicio14
{
    public static void main(String[] args)
    {
        double ventasDep1,ventasDep2,ventasDep3,salario;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el importe global de las ventas del depto. 1: ");
        ventasDep1 = scanner.nextDouble();

        System.out.print("Ingrese el importe global de las ventas del depto. 2: ");
        ventasDep2 = scanner.nextDouble();

        System.out.print("Ingrese el importe global de las ventas del depto. 3: ");
        ventasDep3 = scanner.nextDouble();

        System.out.print("Ingrese el salario de los empleados: ");
        salario = scanner.nextDouble();

        var ventasTotales = ventasDep1 + ventasDep2 + ventasDep3;
        var porcentajeVentas = ventasTotales * 0.33;
        var salarioAumento = salario * 0.2;

        // Sentencia para el depto 1
        if (ventasDep1 > porcentajeVentas)
        {
            System.out.println("El salario de los empleados del depto. 1 es:  " + (salario + salarioAumento));
        }
        else
        {
            System.out.println("El salario de los empleados del depto. 1 es:  " + salario);
        }
        // Sentencia para el depto 1
        if (ventasDep2 > porcentajeVentas) 
        {
            System.out.println("El salario de los empleados del depto. 2 es:  " + (salario + salarioAumento));
        }
        else
        {
            System.out.println("El salario de los empleados del depto. 2 es:  " + salario);
        }
        // Sentencia para el depto 1
        if (ventasDep3 > porcentajeVentas)
        {
            System.out.println("El salario de los empleados del depto. 3 es:  " + (salario + salarioAumento));
        }
        else
        {
            System.out.println("El salario de los empleados del depto. 3 es:  " + salario);
        }
    }
}
