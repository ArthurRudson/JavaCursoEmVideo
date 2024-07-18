/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipospprimitivos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TipospPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        //System.out.printf("A nota é %.2f \n" , nota);
        //System.out.println("A nota e " + nota);
        //System.out.printf("A nota do %s e %.4f \n", nome , nota);
        System.out.format("A nota  do %s e %.2f \n", nome , nota);
    }
    
}
