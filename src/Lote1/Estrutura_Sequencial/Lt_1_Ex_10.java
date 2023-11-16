package Lote1.Estrutura_Sequencial;
import javax.swing.JOptionPane;

public class Lt_1_Ex_10 {
  //10.	Receba 2 números reais. Calcule e mostre a diferença desses valores.
  public static void main(String args[]){
      double num1,num2,dif;
      num1 = Double.parseDouble(JOptionPane.showInputDialog("Olá, informe um número real"));
      num2 = Double.parseDouble(JOptionPane.showInputDialog("Agora, informe um segundo número real"));

      dif = num1 - num2;
      JOptionPane.showMessageDialog(null,"A diferença entre os números informados é: " + dif);
  }
}
