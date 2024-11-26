/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author Edgar
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = 1;
        int d = 3;
        int contador = 0;
        int ciclo = 6;
        String signo;
        String cadena;
        cadena = "1";
        
        while (contador <= ciclo){
            
            if(contador % 2 == 0){
                signo = "-";
            }else{
                signo = "+";
            }
            
        cadena = cadena +" " + signo +" " + n +"/"+ d ;
        d = d + 2;
        contador = contador + 1;
        
        }
        
        System.out.println(cadena); 
        
    }
}
    
