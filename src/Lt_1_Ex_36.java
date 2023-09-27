import javax.swing.JOptionPane;

public class Lt_1_Ex_36 {
  // 36. Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
  public static void main(String args[]) {

    double n;
    n = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe um número"));

    JOptionPane.showMessageDialog(null, "O valor final da serie é: " + FunctionSerieN(n));

  }

  static double FunctionSerieN(double n) {
    double serie = 1;
    double fat = 1;

    for (int i = 1; i <= n; i++) {
      for (int j = i; j > 0; j--) {
        fat = fat * j;
      }
      serie += 1 / fat;
      fat = 1;
    }
    return serie;

  }
}
