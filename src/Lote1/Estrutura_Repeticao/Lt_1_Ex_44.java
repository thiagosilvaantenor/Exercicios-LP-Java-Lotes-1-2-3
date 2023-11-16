package Lote1.Estrutura_Repeticao;
import javax.swing.JOptionPane;

public class Lt_1_Ex_44 {
  // 44. Receba o número da base e do expoente. Calcule e mostre o valor da
  // potência.

  public static void main(String args[]) {
    int base, expoente;

    base = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe o valor da base"));
    expoente = Integer.parseInt(JOptionPane.showInputDialog("Agora, informe o expoente"));

    JOptionPane.showMessageDialog(null, "O valor da potência é: " + FunctionPotencia(base, expoente));

  }

  static int FunctionPotencia(int base, int expoente) {
    int potencia = 1;
    if (expoente == 0)
      potencia = 1;
    else {
      for (int i = 1; i <= expoente; i++) {
        potencia = potencia * base;
      }
    }
    return potencia;
  }
}
