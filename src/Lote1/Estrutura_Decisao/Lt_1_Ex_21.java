package Lote1.Estrutura_Decisao;
import javax.swing.JOptionPane;
public class Lt_1_Ex_21 {
    
    static double media;
    public static void main(String args[]){
        double n1,n2,n3,n4;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Olá, informe o valor da primeira nota"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Agora, informe o valor da segunda nota"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Por fim, informe o valor da terceira nota"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Por fim, informe o valor da quarta nota"));
        
        ProcedureMedia_Resultado(n1,n2,n3,n4);
    }
    
    static void ProcedureMedia_Resultado(double n1,double n2,double n3,double n4){
        media = (n1+n2+n3+n4) / 4;
        
        if(media > 6.0){
            System.out.println("APROVADO!\nMedia: " + media);
        } 
        else if(media >= 3 & media <= 6){
            System.out.println("EXAME!\nMedia: " + media);
        } else{
            System.out.println("REPROVADO!\nMedia: " + media);
        }
    }
}
