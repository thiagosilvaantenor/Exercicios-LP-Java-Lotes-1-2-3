package Lote2.Recursividade;
import javax.swing.JOptionPane;

public class Lt_2_Ex_5 {
  // 5) Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)!
  public static void main(String args[]) {
    double serie;
    serie = Double.parseDouble(JOptionPane.showInputDialog("Olá, informe um número"));
    JOptionPane.showMessageDialog(null, FunctionRecursividadeCinco(serie));
  }

  static double Fatorial(double num) {
    if (num == 1)
      return 1;
    else
      return num * Fatorial(num - 1);
  }

  static double FunctionRecursividadeCinco(double n) {
    if (n == 1)
      return 1;
    else
      return Fatorial(n) + FunctionRecursividadeCinco(n - 1);
  }
}
