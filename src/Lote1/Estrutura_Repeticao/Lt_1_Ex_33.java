package Lote1.Estrutura_Repeticao;
import javax.swing.JOptionPane;

public class Lt_1_Ex_33 {
  //33.	Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
  public static void main(String args[]){
    int num;
    
    num = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe um número"));
        
    JOptionPane.showMessageDialog(null,"O valor final da serie é: " + FunctionSerie(num));
  }

  static double FunctionSerie(double n){
    double serie= 1.0;
    for(int i = 2; i <= n; i++){
      serie += (1.0 / i);
    }
    return serie;

  }


}
