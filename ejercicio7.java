import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.print("Escriba el primer numero (A) ");
        double a= entrada.nextDouble();
        System.out.print("Escriba el segundo numero (B) ");
        double b= entrada.nextDouble();
        if (a > b) {
            System.out.println("A es mayor que B");
        } else if (a == b) {
            System.out.println("A es igual que B");
        } else {
            System.out.println("A es menor que B");
        }


    }
    
}
