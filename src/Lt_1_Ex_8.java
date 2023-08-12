import javax.swing.JOptionPane;

public class Lt_1_Ex_8 {
  /* 8.	Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m. */
  public static void main(String args []){
    double dep,juros,total;
    int tempo;

    dep = Double.parseDouble(JOptionPane.showInputDialog("Olá, informe o valor do deposito"));
    juros = 0.013;
    tempo = 1;

    total = dep + (dep * (juros*tempo));
    JOptionPane.showMessageDialog(null,"O valor total após " + tempo + " mês a " + (juros*100) + "% de juros a. m. é: " + total);
  }






}
