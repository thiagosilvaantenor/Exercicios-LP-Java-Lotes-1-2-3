package Lote3.Vetores_Matrizes;
import javax.swing.JOptionPane;

public class Lt_3_Ex_12 {
  /*
   * 12. Carregar códigos das peças em um tabuleiro de xadrez, onde:
   * Codigo:|1 |2 |3 |4 |5 |6 |7
   * Peça: |Peão|Torre|Bispo|Cavalo|Rainha|Rei|Vazio
   * Calcular e mostrar a soma das peças do tabuleiro
   * Não pode utilizar estrutura de decisão e escolha Caso na contagem das peças
   */
  public static void main(String args[]) {
    int mat[][] = new int[8][8];
    //ProcedureCarregaTabuleiro(mat);
  }

  // Carregar peças na mesma posição que ficariam em um tabuleiro de xadrez
  /*
  static void ProcedureCarregaTabuleiro(int m[][]) {
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m.length; j++) {
        m[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
            "Informe a peça de tabuleiro que deseja colocar, usando:\n1 = Peão, 2 = Torre, 3 = Bispo, 4 = Cavalo, 5 = Rainha, 6 = Rei, 7 = Vazio"));
      }
    }
  }
  */

  /* static int FunctionSomaTabuleiro(int m[][]) {
    int som = 0;
    for(int i = 0; i < m.length; i++){
      for(int j = 0; j < m.length; j++){
        som += m[i][j];
      }
    }
    return som;
  }
  */

}