package Lote1.Estrutura_Decisao;
import javax.swing.JOptionPane;

public class Lt_1_Ex_29 {
  // 29. Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor
  // do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a
  // poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados
  static double valorNovo;
  public static void main(String args[]) {
    int tipoInv = 0;
    double valorInv;

    while (tipoInv >= 3 || tipoInv <= 0) {
      tipoInv = Integer.parseInt(JOptionPane
          .showInputDialog("Olá, informe o tipo de investimento, digite 1 para poupança ou 2 para renda fixa"));
    }
    valorInv = Double.parseDouble(JOptionPane.showInputDialog("Agora, informe o valor do investimento"));
    
    ProcedureValorNovo(tipoInv,valorInv);

    JOptionPane.showMessageDialog(null,
    "O valor novo pós aplicação poupança é: " + valorNovo);
    

  }

  static void ProcedureValorNovo(int tipoInv, double valorInv) {
    double percentual;
    // Inv = poupança
    if (tipoInv == 1) {
      percentual = 0.03;
      valorNovo = valorInv + (valorInv * percentual);
    } // Inv = renda fixa
    else {
      percentual = 0.05;
      valorNovo = valorInv + (valorInv * percentual);
    }

  }
}
