import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: ");
        int valorCompra = entrada.nextInt();
        
        entrada.nextLine();

        System.out.print("Ingrese el color de la bolita (blanca, verde, amarilla, azul o roja): ");
        String colorBolita = entrada.nextLine();
        
        double descuento = 0;

        if (colorBolita.equals("verde")) {
            descuento = valorCompra * 0.10;
        } else if (colorBolita.equals("amarilla")) {
            descuento = valorCompra * 0.25;
        } else if (colorBolita.equals("azul")) {
            descuento = valorCompra * 0.50;
        } else if (colorBolita.equals("roja")) {
            descuento = valorCompra;
        }

        double valorAPagar = valorCompra - descuento;

        System.out.println("El cliente debe pagar $" + valorAPagar);

    }
}
