/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0, p=0, i=0, aC=0, m=0, q=0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um numero: <br><em>(valo 0 interrompe)</em></html>"));
            s += n;
            if (n %2 == 0){
                p++;
            } else {
                i++;
            }
            if ( n > 100){
                aC++;
            }
            q++;
            m = s/q;
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" +"<br> Somatorio vale: "+ s +" numeros de pares: " + p +" numero de impares: " +i+"acima de 100: "+aC+"media: "+m+"</html");
    }
    
}
