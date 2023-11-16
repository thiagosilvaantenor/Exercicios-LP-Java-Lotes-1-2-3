package Lote1.Estrutura_Sequencial;
import javax.swing.JOptionPane;

public class Lt_1_Ex_12 {
  /* 12.	Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos. */
  public static void main(String args[]){
    int anoNasc,anoAt,idadeAt,idadeFutura;

    anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe o ano de nascimento"));
    anoAt = Integer.parseInt(JOptionPane.showInputDialog("Agora, informe o ano atual"));

    idadeAt = anoAt - anoNasc;
    idadeFutura = 17 + idadeAt;

    JOptionPane.showMessageDialog(null,"A idade atual é: " + idadeAt + "\nJá a idade daqui a 17 anos será: " + idadeFutura);
  }
}
