import java.util.Scanner;

public class Ejercicio23
{
    public static void main(String[] args)
    {
        double a,b,c;
        double x1,x2;                                 // variables para las soluciones.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de parametro A: ");
        a = scanner.nextDouble();

        System.out.print("Ingrese el valor de parametro B: ");
        b = scanner.nextDouble();

        System.out.print("Ingrese el valor de parametro C: ");
        c = scanner.nextDouble();

        var discriminante = (Math.pow(b,2) - (4*a*c));    // El discriminante es el argumento de la raiz. De el depende la solución.


        if (discriminante > 0)
        {
            x1 = (- b + Math.sqrt(discriminante))/ (2*a);
            x2 = (-b - Math.sqrt(discriminante))/ (2*a);

            System.out.println("La ecuación tiene dos posibles soluciones:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else if (discriminante == 0)
        {
            x1 = (-(b) + Math.sqrt(discriminante))/ (2*a);

            System.out.println("La ecuación tiene una única solución: ");
            System.out.println("x = " + x1);
        }
        else
        {
            System.out.println("La ecuación no tiene solución.");
        }
    }
}
