package Lote1.Estrutura_Decisao;
import javax.swing.JOptionPane;
public class Lt_1_Ex_19 {
   // Receba dois valores reais. Calcule e mostre o maior deles.
    static Double maior;
    public static void main(String args[]){
        double n1,n2;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Olá, informe um valor real"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Agora, informe mais um valor real"));
        
        ProcedureMaior(n1,n2);
        
        JOptionPane.showMessageDialog(null, "O maior número é: "+ maior);     
    }
    
    static void ProcedureMaior(double n1, double n2){
        if(n1 > n2)
            maior = n1;
        else
            maior = n2;
        
    }
}
