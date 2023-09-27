import javax.swing.JOptionPane;

public class Lt_1_Ex_18 {
 /* 18.	Receba 2 valores inteiros. 
 Calcule e mostre o resultado da diferença do maior pelo menos valor. */
    static int dif;
  public static void main(String args[]){
     int num1,num2;
      num1 = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe um número inteiro"));
      num2 = Integer.parseInt(JOptionPane.showInputDialog("Agora, informe mais um número inteiro"));
      
      ProcedureDiferenca(num1,num2);
      
      JOptionPane.showMessageDialog(null, "A diferença do maior para o menor, dos números informados é: " + dif);
  }
  
  static void ProcedureDiferenca(int n1,int n2){
      
      if(n1 > n2)
        dif = n1 - n2;
      else
        dif = n2 - n1;
      
  }
}
