
package com.mycompany.pruebafiguras;

public class Trapecio {
    
    int baseMayor; 
    int baseMenor; 
    int lado1;
    int lado2;
    int altura;
    
    public Trapecio(int baseMayor, int baseMenor, int lado1, int lado2, int altura) {
    this.baseMayor = baseMayor;
    this.baseMenor = baseMenor;
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.altura = altura;
    }
    
    double calcularArea() {
    return (((baseMenor + baseMayor) * altura) / 2);
    }
    
    double calcularPerimetro() {
    return (baseMenor + baseMayor + lado1 + lado2); 
    }
    
}
