
package com.mycompany.pruebafiguras;

public class Rombo {
    
    int diagonalMayor; 
    int diagonalMenor; 
    
    public Rombo(int diagonalMayor, int diagonalMenor) {
    this.diagonalMayor = diagonalMayor;
    this.diagonalMenor = diagonalMenor;
    }
    
    double calcularHipotenusa() {
    return Math.pow(diagonalMayor*diagonalMayor + diagonalMenor*diagonalMenor, 0.5);
    }
    
    double calcularArea() {
    return ((diagonalMenor * diagonalMayor) / 2);
    }
    
    double calcularPerimetro() {
    return (4 * calcularHipotenusa()); 
    }
    
}
