/* 
 Se tiene la siguiente información de un empleado:
 · código del empleado,
 · nombres,
 · número de horas trabajadas al mes,
 · valor hora trabajada,
 · porcentaje de retención en la fuente.
 Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto.
*/ 

import java.util.Scanner;

public class Ejercicio18 {
    
    public static void main (String[] args){
        
        double vhtrabajada, prfuente, sbruto, sneto;
        String nom;
        int htrabajadasmes, cemple;
        
        System.out.println("Ingrese el código del empleado");
        Scanner entrada1 = new Scanner(System.in);
        cemple = entrada1.nextInt();
        
        System.out.println("Ingrese el nombre del empleado");
        Scanner entrada2 = new Scanner(System.in);
        nom = entrada2.nextLine();
        
        System.out.println("Ingrese horas trabajadas en el mes del empleado");
        Scanner entrada3 = new Scanner(System.in);
        htrabajadasmes = entrada3.nextInt();
        
        vhtrabajada = 50000;
        prfuente = 0.08;

        sbruto = htrabajadasmes * vhtrabajada;
        sneto = sbruto * prfuente;

        System.out.println("-------------------------------------");
        System.out.println("Código del empleado: "+ cemple);
        System.out.println("Nombre: "+ nom);
        System.out.format("Salario bruto: $"+ "%f%n",sbruto);
        System.out.println("Salario neto: $"+ sneto);
        System.out.println("-------------------------------------");

    }  
    
}
