package Lote3.Vetores_Matrizes;
import javax.swing.JOptionPane;

public class Lt_3_Ex_10 {
  /*
   * 10. Criar uma matriz [8][8] onde o programa irá carregar segundo:
   * casa |1|2|3|4|...|* Exibir a soma
   * valor|1|2|4|8|...|* dos valores
   */
  public static void main(String args[]) {
    int matriz[][] = new int[8][8];
    ProcedureCarregaMCasaValor(matriz);
    JOptionPane.showMessageDialog(null,
        "Olá, o valor da soma de valores da matriz foi: " + FunctionSomaValores(matriz));
  }

  static void ProcedureCarregaMCasaValor(int m[][]) {
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m.length; j++) {
        if (j == 0)
          m[i][j] = 1;
        else
          m[i][j] = (m[i][j - 1]) * 2;
        /*
         * 0 1 2 3
         * 0 1 2 4 8
         * 1 1 2 4 8
         * 2 1 2 4 8
         * 3 . . . .
         */
      }
    }
  }

  static int FunctionSomaValores(int m[][]) {
    int soma = 0;
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m.length; j++) {
        soma += m[i][j];
      }
    }
    return soma;
  }
}
