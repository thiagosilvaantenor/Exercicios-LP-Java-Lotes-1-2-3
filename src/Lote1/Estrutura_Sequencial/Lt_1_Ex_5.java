package Lote1.Estrutura_Sequencial;
import javax.swing.JOptionPane;

public class Lt_1_Ex_5 {
  /*5.	Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue2 raízes). */
  public static void main (String[] args){
      double coA,coB,coC,delta,r1,r2;
      coA = Double.parseDouble(JOptionPane.showInputDialog("Olá, informe o coeficiente A"));
      coB = Double.parseDouble(JOptionPane.showInputDialog("Agora, informe o coeficiente B"));
      coC = Double.parseDouble(JOptionPane.showInputDialog("E por fim, informe o coeficiente C"));

      delta = (Math.pow(coB,2))-4*coA * coC;
      r1 = (-(coB) + (Math.sqrt(delta))) / (2*coA);
      r2 = (-(coB) - (Math.sqrt(delta))) /(2*coA);
      JOptionPane.showMessageDialog(null,"As raizes da equação foram: " + r1 + ", e, " + r2);

  }
}
