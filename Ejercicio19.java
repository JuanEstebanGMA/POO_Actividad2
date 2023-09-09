/*
Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el
perímetro, el valor de la altura y el área del triángulo. 
*/

import java.util.Scanner;

public class Ejercicio19 {
    
    public static void main (String[] args){
        
        double l, p, h, a;
        
        System.out.println("Ingrese la medida del lado del triangulo");
        Scanner entrada = new Scanner(System.in);
        l = entrada.nextDouble();
        
        p = 3 * l;
        h = (l * Math.sqrt(3))/2;
        a = (Math.pow(l,2)* Math.sqrt(3))/4;
        
        System.out.println("-----------------------------------------");
        System.out.println("Perímetro del triangulo: " + p);
        System.out.println("Altura del triangulo: " + h);
        System.out.println("Área del triangulo: " + a);
        System.out.println("-----------------------------------------");
        
    }
    
}
