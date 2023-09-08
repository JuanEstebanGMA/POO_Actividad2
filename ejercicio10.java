import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero de inscripcion: ");
        int ni= entrada.nextInt();
        entrada.nextLine();
        System.out.print("Nombre completo: ");
        String nom= entrada.nextLine();
        System.out.print("Patrimonio: ");
        int pat= entrada.nextInt();
        System.out.print("Estrato social: ");
        int est= entrada.nextInt();
        int pagmat=50000;
        if(pat>2000000 && est>3){
            pagmat=(int)(pagmat + 0.03*pat);
        }
        System.out.println("El estudiante con numero de inscripcion " + ni + " y nombre " + nom + " debe pagar $" + pagmat);
        
    }
    
}
