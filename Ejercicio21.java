/* 
Dados los tres lados de un triángulo, haga un algoritmo que encuentre: perímetro,
semiperímetro y el área del triángulo. 
*/

import java.util.Scanner;

public class Ejercicio21 {
    
      public static void main (String[] args){
          
          double l1, l2, l3, p, a, sp;
          
          System.out.println("Ingrese la medida del lado del triangulo");
          Scanner entrada1 = new Scanner(System.in);
          l1 = entrada1.nextDouble();
          
          System.out.println("Ingrese la medida del lado del triangulo");
          Scanner entrada2 = new Scanner(System.in);
          l2 = entrada2.nextDouble();
          
          System.out.println("Ingrese la medida del lado del triangulo");
          Scanner entrada3 = new Scanner(System.in);
          l3 = entrada3.nextDouble();
          
          p = l1 + l2 + l3;
          sp = p/2;
          a = Math.sqrt((sp)*(sp - l1)*(sp - l2)*(sp - l3));
          
          System.out.println("-----------------------------------------");
          System.out.println("Perímetro del triangulo: " + p);
          System.out.println("Semiperímetro del triangulo: " + sp);
          System.out.println("Área del triangulo: " + a);
          System.out.println("-----------------------------------------");
          
      }
}
