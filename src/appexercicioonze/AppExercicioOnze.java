/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexercicioonze;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class AppExercicioOnze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    double diagonalMenor,diagonalMaior,AreaLosango;
        
        Scanner teclado = new Scanner (System.in);
       
       System.out.println("Digite a diagonal menor do losango: "); 
       diagonalMenor = teclado.nextDouble();
       System.out.println("Digite a diagonal maior do losango: "); 
       diagonalMaior = teclado.nextDouble();
       AreaLosango = diagonalMenor * diagonalMaior / 2.0;
    
        System.out.println("A area de um losango e:" +AreaLosango);
    
    
    
    
    }
    
}
