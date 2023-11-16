package Lote1.Estrutura_Repeticao;
import javax.swing.JOptionPane;

public class Lt_1_Ex_43 {
  // 43. Calcule e mostre quantos anos serão necessários para que Ana seja maior
  // que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e
  // cresce 2 cm ao ano.

  public static void main(String args[]) {
    double ana, maria;
    ana = 1.10;
    maria = 1.5;

    JOptionPane.showMessageDialog(null, "Após " + FunctionAnaEMaria(ana, maria) + " anos, Ana é maior que Maria!");
  }

  static int FunctionAnaEMaria(double ana, double maria) {
    int anos = 1;
    while (maria > ana) {
      ana = ana + 0.03;
      maria = maria + 0.02;
      anos++;
    }
    System.out.println(ana + "," + maria);
    return anos;

  }
}
