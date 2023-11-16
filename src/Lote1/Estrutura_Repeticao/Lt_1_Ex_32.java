package Lote1.Estrutura_Repeticao;
import javax.swing.JOptionPane;

public class Lt_1_Ex_32 {
  // 32. Receba um número inteiro. Calcule e mostre o seu fatorial.
  public static void main(String args[]) {
    int num;

    num = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe um número inteiro"));

    JOptionPane.showMessageDialog(null, "O fatorial de " + num + ", é: " + FunctionFatorial(num));
  }

  static int FunctionFatorial(int n) {
    int fat = 1, i;

    for (i = n; i > 0; i--) {
      fat = fat * i;
    }

    return fat;

  }

}
