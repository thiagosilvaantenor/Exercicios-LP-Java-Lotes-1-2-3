package Lote1.Estrutura_Sequencial;
import javax.swing.JOptionPane;

public class Lt_1_Ex_13 {
  /* 13.	Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia. */
  public static void main(String args[]){
      double qntKg;
      int dias;

      qntKg = Double.parseDouble(JOptionPane.showInputDialog("Olá, informe a quantidade de alimento em quilos"));
      //converter Kg em g
      //1Kg -> 1000g
      qntKg = qntKg * 1000;
      
      dias = (int) qntKg / 50;

      JOptionPane.showMessageDialog(null,"A quantidade de dias que durará esse alimento será: " + dias);
  }
}
