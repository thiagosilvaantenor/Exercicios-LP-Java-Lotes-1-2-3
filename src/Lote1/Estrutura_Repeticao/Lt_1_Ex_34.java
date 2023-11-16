package Lote1.Estrutura_Repeticao;
import javax.swing.JOptionPane;

public class Lt_1_Ex_34 {
  // 34. Receba um número. Calcule e mostre os resultados da tabuada desse número.
  public static void main(String args[]) {
    int num;

    num = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe um número"));
    System.out.println("A tabuada do número: " + num);

    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " X " + i + " = " + FunctionMultiplica(num, i));
    }

  }

  static int FunctionMultiplica(int n, int i) {
    int mul;

    mul = n * i;
    return mul;

  }
}
