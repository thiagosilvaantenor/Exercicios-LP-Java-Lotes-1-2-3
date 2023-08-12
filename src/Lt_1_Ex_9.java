import javax.swing.JOptionPane;
public class Lt_1_Ex_9 {
  // 9.	Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
  public static void main(String args []){
    int num1,num2,soma;
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Olá, nforme um número inteiro"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Agora, informe outro número inteiro"));

    soma = (num1 * num1) + (num2 * num2);
    JOptionPane.showMessageDialog(null,"A soma dos quadrados dos números informados é: " + soma);
  }  
}
