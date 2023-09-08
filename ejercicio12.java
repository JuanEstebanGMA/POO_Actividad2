import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        double horas = entrada.nextDouble();

        System.out.print("Ingrese el valor recibido por una hora normal de trabajo: ");
        double valorHoraNormal = entrada.nextDouble();

        double salario = 0;

        if (horas <= 40) {
            salario = horas * valorHoraNormal;
        } else if (horas <= 48) {
            double horasNormales = 40;
            double horasExtra = horas - horasNormales;
            salario = (horasNormales * valorHoraNormal) + (horasExtra * (valorHoraNormal * 2));
        } else {
            double horasNormales = 40;
            double horasExtra8 = 8;
            double horasExtraRestantes = horas - (horasNormales + horasExtra8);
            salario = (horasNormales * valorHoraNormal) + (horasExtra8 * (valorHoraNormal * 2)) + (horasExtraRestantes * (valorHoraNormal * 3));
        }

        System.out.println("Nombre del trabajador: " + nombre);
        System.out.println("Salario devengado: $" + salario);
    }
}
