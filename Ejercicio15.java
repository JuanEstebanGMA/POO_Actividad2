import java.util.Scanner;

public class Ejercicio15
    {
    public static void main(String[] args) 
    {
        double pesoA, pesoB, pesoC, pesoD;  // Declaración de las variables para los pesos.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso de A: ");
        pesoA = scanner.nextDouble();

        System.out.print("Ingrese el peso de B: ");
        pesoB = scanner.nextDouble();

        System.out.print("Ingrese el peso de C: ");
        pesoC = scanner.nextDouble();

        System.out.print("Ingrese el peso de D: ");
        pesoD = scanner.nextDouble();

        var esferaDiferente = 0.0;
        var esferaPesoIgual = 0.0;            // Variable temporal para la esfera con peso igual a las otras.

        if ((pesoD == pesoB) && (pesoB == pesoC))
        {
            esferaDiferente = pesoA;
            esferaPesoIgual = pesoD;

            System.out.println("La esfera diferente es A");
        }
        else if ((pesoD == pesoC) && (pesoC == pesoA)) 
        {
            esferaDiferente = pesoB;
            esferaPesoIgual = pesoD;

            System.out.println("La esfera diferente es B");
        }
        else if ((pesoD == pesoB) && (pesoB == pesoA)) 
        {
            esferaDiferente = pesoC;
            esferaPesoIgual = pesoD;

            System.out.println("La esfera diferente es C");
        }
        else 
        {
            esferaDiferente = pesoD;
            esferaPesoIgual = pesoA;

            System.out.println("La esfera diferente es D");
        }

        if (esferaDiferente > esferaPesoIgual) 
        {

            System.out.println("Y su peso es mayor que los otros.");
        }
        else 
        {
            System.out.println("Y su peso es menor que los otros.");
        }
    }
}
