package Lote1.Estrutura_Sequencial;
import javax.swing.JOptionPane;
public class Lt_1_Ex_2 {
   public static void main(String args[]){
       double Sal,NovoSal,reajuste;
       Sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
       reajuste = Double.parseDouble(JOptionPane.showInputDialog("informe o valor do reajuste salarial, ex: para 15% digite 0,15"));
       NovoSal = Sal + (Sal*reajuste);
       System.out.println("Novo Salario é : " + NovoSal);   
   } 
}
