import javax.swing.JOptionPane;

public class Lt_2_Ex_4 {
  //4)   Serie4 = (N/1) +(N-1 / 2) + (N-2 / 3) + .... + (1/N) 

  public static void main(String args[]){
    double serie,i;
    i=1;
    serie = Double.parseDouble(JOptionPane.showInputDialog("Olá, informe um valor"));
    JOptionPane.showMessageDialog(null,"O resultado de serie é: "+ FunctionRecursividadeQuatro(serie, i)); 
  }

  static double FunctionRecursividadeQuatro(double n,double i){
      if(n == 1)
        return n/i;
      else
        return n/i + FunctionRecursividadeQuatro(n-1,i+1);
  }
}
