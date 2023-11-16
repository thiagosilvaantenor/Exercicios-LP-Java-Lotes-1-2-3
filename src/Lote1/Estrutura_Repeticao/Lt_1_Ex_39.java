package Lote1.Estrutura_Repeticao;
import javax.swing.JOptionPane;

public class Lt_1_Ex_39 {

  public static void main(String args[]) {
    /*
     * 39. Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
     * Casa: 1 2 3 4 ... 64
     * Qdte: 1 2 4 8 ... N
     */
    int qtd = 1;

    JOptionPane.showMessageDialog(null, "O total de grãos é: " + FunctionTotalGraos(qtd));

  }

  static int FunctionTotalGraos(int qtd) {
    int casa, total = 1;
    for (casa = 1; casa <= 63; casa++) {
      qtd = (qtd + qtd);
      total += qtd;
    }
    return total;
  }
}
