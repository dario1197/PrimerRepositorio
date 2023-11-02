package EjerciciosBucles;
//cambio rama1
//cambio rama2

import java.util.Scanner;

/**
 *
 * @author developer
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int suma=0;
        double media;
        int contador=0;
        do{
            System.out.println("Dime un numero");
            num=sc.nextInt();
            contador++;
            suma+=num;
            
        }while(num>0);
        System.out.println("La media es: "+(suma/(contador-1)));
    }
    
}
