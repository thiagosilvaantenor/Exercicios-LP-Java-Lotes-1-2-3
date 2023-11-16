package Lote3.Vetores_Matrizes;
import javax.swing.JOptionPane;

public class Lt_3_Ex_5 {
  /*
   * Criar e coletar um vetor[20] inteiro Calcule e exiba:
   * soma de 1 a 10 (vet[1] - vet[21-1])
   */
  public static void main(String args[]) {
    int vet[] = new int[20];

    for (int i = 0; i <= 19; i++) {
      vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe um número inteiro"));
    }
    JOptionPane.showMessageDialog(null,
        "O valor da soma, seguindo a formula, soma+(vet[1]-vet[21-1]) é: " + FunctionVetorCinco(vet));

  }

  static int FunctionVetorCinco(int vet[]) {
    int soma = 0;
    for (int i = 0; i >= 20; i++) {
      soma += (vet[i] - vet[20 - i]);
    }
    return soma;
  }
}
