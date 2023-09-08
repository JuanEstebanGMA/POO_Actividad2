import java.util.Scanner;

public class Ejercicio24
{
    public static void main(String[] args)
    {
        double pesoA, pesoB, pesoC;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso de la esfera A: ");
        pesoA = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera B: ");
        pesoB = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera C: ");
        pesoC = scanner.nextDouble();

        if ((pesoA > pesoB) && (pesoA > pesoC))
        {
            System.out.println("La esfera con mayor peso es A");
        }
        else if ((pesoB > pesoA) && (pesoB > pesoC))
        {
            System.out.println("La esfera con mayor peso es B");
        }
        else if ((pesoC > pesoA) && (pesoC > pesoB))
        {
            System.out.println("La esfera con mayor peso es C");
        }
        else
        {
            System.out.println("Todos los pesos son iguales");
        }
    }
}
