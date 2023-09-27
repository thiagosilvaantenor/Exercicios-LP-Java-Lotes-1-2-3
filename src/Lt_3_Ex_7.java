import javax.swing.JOptionPane;

public class Lt_3_Ex_7 extends Lt_3_Ex_6{
  /*7.	A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e 
  verificar a sua existência no vetor (utilizar pesquisa binária). */
  public static void main(String args[]){
    int vet[] = new int[20];
    int val;

    for (int i = 0; i <= 19; i++) {
      vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe números em ordem aleatória"));
    }

    ProcedureVetOrdenador(vet);
    MostraVet(vet);
    val = Integer.parseInt(JOptionPane.showInputDialog("Olá, agora informe um valor"));
    ProcedurePesquisaBin(val, vet);

  }

  static void ProcedurePesquisaBin(int val, int vet[]){
    int metade=0;
    int fim = vet.length;
    int i = 1;
    boolean achou = false;

    while(achou =! true || i <= fim){
      metade = (i + fim) / 2;
      if(vet[metade] == val){
        achou = true;
        break;
      }
      if(vet[metade] < val){
        i = metade + 1;
      } else {
        fim = metade - 1;
      }
    }
    if(achou)
      JOptionPane.showMessageDialog(null,"O valor " + val + ", está na posição: " + metade);
    else
      JOptionPane.showMessageDialog(null,"O valor " + val + ", não foi encontrado no vetor!");
  }
}
