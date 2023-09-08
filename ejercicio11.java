import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el primer numero (A): ");
        int a = entrada.nextInt();

        System.out.print("Escriba el segundo numero (B): ");
        int b = entrada.nextInt();

        System.out.print("Escriba el tercer numero (C): ");
        int c = entrada.nextInt();
        int mayor = 0;

        if (a > b && a > c) {
            mayor = a;
        } else if (b > c) {
            mayor = b;
        } else {
            mayor = c;
        }

        System.out.println("El valor mayor entre " + a + ", " + b + " y " + c + " es " + mayor);

    }
}
