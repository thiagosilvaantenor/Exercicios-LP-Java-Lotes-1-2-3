package Lote1.Estrutura_Sequencial;
import javax.swing.JOptionPane;

public class Lt_1_Ex_11 {
  //11.	Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
  public static void main(String args[]){
      double raio,comp;
      raio = Double.parseDouble(JOptionPane.showInputDialog("Olá, informe o valor do raio da circunferencia"));

      comp = 2* raio * 3.14;
      JOptionPane.showMessageDialog(null,"O comprimento da circunferência é: " + comp);
  }
}
