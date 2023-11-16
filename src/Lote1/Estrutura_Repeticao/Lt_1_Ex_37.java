package Lote1.Estrutura_Repeticao;
import javax.swing.JOptionPane;

public class Lt_1_Ex_37 {
  public static void main(String args[]) {
    // 37. Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu
    // N’nésimo termo.
    int num;
    num = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe um número inteiro"));

    JOptionPane.showMessageDialog(null, "O termo " + num + " da serie fibonnaci é: " + FunctionFibonacci(num));
  }

  static int FunctionFibonacci(int num) {
    int x = 1, z = 1, fib = 0;
    for (int i = 1; i <= num; i++) {
      // fib = 1, 1, 2 , 3, 5 , 8
      if (i <= 2)
        fib = 1;
      else {
        fib = z + x;
        x = z;
        z = fib;
      }
    }
    return fib;
  }
}
