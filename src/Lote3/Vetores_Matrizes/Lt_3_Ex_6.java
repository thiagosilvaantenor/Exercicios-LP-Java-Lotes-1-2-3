package Lote3.Vetores_Matrizes;
import javax.swing.JOptionPane;

public class Lt_3_Ex_6 {
  public static void main(String args[]) {
    /*
     * 6. Criar e coletar em um vetor [20] com números aleatórios.
     * Classificar este vetor em ordem crescente e mostre os dados.
     */

    int vet[] = new int[20];

    for (int i = 0; i <= 19; i++) {
      vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe números em ordem aleatória"));
    }

    ProcedureVetOrdenador(vet);
    MostraVet(vet);

  }

  public static void ProcedureVetOrdenador(int vet[]) {
    int aux;
    for (int i = 0; i < vet.length; i++) {
      for (int j = i + 1; j <= 19; j++) {
        if (vet[i] > vet[j]) {
          aux = vet[i];
          vet[i] = vet[j];
          vet[j] = aux;
        }
      }
    }
  }

  public static void MostraVet(int vet[]) {
    JOptionPane.showMessageDialog(null, "Organizando o vetor em ordem crescente...");
    for (int i = 0; i < vet.length; i++) {
      JOptionPane.showMessageDialog(null, vet[i] + "\n");
    }
  }
}
