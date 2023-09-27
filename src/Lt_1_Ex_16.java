import javax.swing.JOptionPane;
public class Lt_1_Ex_16 {
  /*
   * 16. Receba a quantidade de horas trabalhadas, o valor por hora, o percentual
   * de desconto e o número de descendentes. Calcule o salário que serão as horas
   * trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto –
   * desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba
   * o salário a receber.
   */
  public static void main(String args[]) {
      double desconto,valorHora,SalLiquido,SalBruto;
      int horaTrab, dependente;

      horaTrab = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de horas de trabalho"));
      valorHora = Double.parseDouble(JOptionPane.showInputDialog("Agora, informe o valor pago por cada hora de trabalho"));
      desconto = Double.parseDouble(JOptionPane.showInputDialog("Também informe o valor de desconto, em percentual"));
      dependente = Integer.parseInt(JOptionPane.showInputDialog("Por fim, informe o número de dependentes"));


      desconto = desconto / 100;
      SalBruto = horaTrab * valorHora;
      SalLiquido = SalBruto - (SalBruto * desconto);
      SalLiquido = SalLiquido + (dependente * 100);

      JOptionPane.showMessageDialog(null,"O Salario Liquido é: " + SalLiquido);


  }
}
