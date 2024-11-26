/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author Edgar
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int limite = 10;
        int n = 1;
        int resultado;
        
        while(n<=limite){
            resultado = n * (n+1);
            System.out.println(resultado);
            n = n+1;
        }
        
    }
    
}
