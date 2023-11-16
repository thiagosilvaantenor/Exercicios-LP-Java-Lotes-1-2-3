package Lote1.Estrutura_Sequencial;
import javax.swing.JOptionPane;

public class Lt_1_Ex_14 {
  // 14.	Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
  public static void main(String args[]){
      int angulo1,angulo2,angulo3;
      
      angulo1 = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe o valor do primeiro angulo do triangulo"));
      angulo2 = Integer.parseInt(JOptionPane.showInputDialog("Agora, informe o valor do segundo angulo"));

      angulo3 = 180 - (angulo1 + angulo2);
      JOptionPane.showMessageDialog(null,"O valor do 3° angulo é: " + angulo3);
  }
}
