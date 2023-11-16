package Lote3.Vetores_Matrizes;
import javax.swing.JOptionPane;

public class Lt_3_Ex_4 {
  /*
   * 4. Criar e coletar em um vetor [30] real e calcular e exibir:
   * a. A média do grupo;
   * b. A quantidade de notas acima do grupo;
   * c. As posições dos valores abaixo da média do grupo.
   */

  public static void main(String args[]) {
    double vet[] = new double[30];
    double media = 0;
    int qntAc = 0;

    for (int i = 0; i <= 29; i++) {
      vet[i] = Double.parseDouble(JOptionPane.showInputDialog("Olá, informe um número"));
      media += vet[i];
    }

    media /= 30;
    JOptionPane.showMessageDialog(null, "O valor da média dos valores foi: " + media
        + "\nAs posições que estão abaixo da média serão mostradas no terminal");

    for (int i = 0; i <= 29; i++) {
      if (vet[i] < media) 
        System.out.println("O valor da posição, " + i + ", do vetor está abaixo da média");
      else
        qntAc++;
    }
    JOptionPane.showMessageDialog(null, "Já à quantidade de valores acima da média foi: " + qntAc);

  }
}
