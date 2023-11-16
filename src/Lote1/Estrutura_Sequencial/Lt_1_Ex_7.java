package Lote1.Estrutura_Sequencial;
import javax.swing.JOptionPane;

public class Lt_1_Ex_7 {
   /* 7.	Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume. */
  public static void main (String [] args){
    double comp,largura,altura,volume;

    comp = Double.parseDouble(JOptionPane.showInputDialog("Olá, informe o valor do comprimento"));
    largura = Double.parseDouble(JOptionPane.showInputDialog("Agora, informe o valor da largura"));
    altura = Double.parseDouble(JOptionPane.showInputDialog("Por fim, informe o valor da altura"));

    volume = comp * largura * altura;

    JOptionPane.showMessageDialog(null,"O volume do paralelepido é: " + volume);
  }
}
