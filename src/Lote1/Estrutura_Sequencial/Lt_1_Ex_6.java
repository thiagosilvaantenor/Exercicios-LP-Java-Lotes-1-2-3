package Lote1.Estrutura_Sequencial;
import javax.swing.JOptionPane;

public class Lt_1_Ex_6 {
  /*6.	Receba os valores em x e y.
   Efetua a troca de seus valores e mostre seus conteúdos. */
   
   public static void main(String args []) {
      int x,y,aux;
      x = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
      y = Integer.parseInt(JOptionPane.showInputDialog("Agora, informe mais um número"));
      
      aux = x;
      x = y;
      y = aux;
      JOptionPane.showMessageDialog(null,"X = " + x + "\nY = " + y);
   }
}
