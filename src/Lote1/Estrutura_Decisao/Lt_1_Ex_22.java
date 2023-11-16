package Lote1.Estrutura_Decisao;
import javax.swing.JOptionPane;
public class Lt_1_Ex_22 {
    //receba dois valores inteiros e diferentes. Mostre seus valores em ordem crescente
    static int maior,menor;
    public static void main (String args []){
        int n1,n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe um número inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Agora, informe outro número, diferente do primeiro"));
        
        ProcedureOrdenaVal(n1,n2);
        
        JOptionPane.showMessageDialog(null,"Os valores informados, em ordem crescente são: " + menor + ", " + maior);  
    }
    static void ProcedureOrdenaVal(int num1,int num2){
        if(num1 > num2){
            maior = num1;
            menor = num2;
        }
        else {
            maior = num2;
            menor = num1;
        }
    }
            
}
