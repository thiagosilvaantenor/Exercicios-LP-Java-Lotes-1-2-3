package Lote1.Estrutura_Decisao;
import javax.swing.JOptionPane;
public class Lt_1_Ex_20 {
    static double coA,coB,coC,delta,r1,r2; 
    public static void main(String args[]){
        
        coA = Double.parseDouble(JOptionPane.showInputDialog("Olá, informe o coeficiente A"));
        coB = Double.parseDouble(JOptionPane.showInputDialog("Agora, informe o coeficiente B"));
        coC = Double.parseDouble(JOptionPane.showInputDialog("Por fim, informe o coeficiente C"));
        
       ProcedureRaizes();

    }
    
    static void ProcedureRaizes(){
        
        delta = (Math.pow(coB,2)) - 4*coA*coC;
        
        if(delta > 0){
            r1 = (-(coB) + (Math.sqrt(delta)) / (2*coA));
            r2 = (-(coB) - (Math.sqrt(delta)) / (2*coA));
            JOptionPane.showMessageDialog(null,"Equação com duas raizes, a primeira: " + r1 + "\nJá a segunda vale: " + r2);
        } 
        else if (delta == 0) {
            r1 = (-(coB) + (Math.sqrt(delta)) / (2*coA));
            JOptionPane.showMessageDialog(null,"Equação com apenas uma raiz, que vale: " + r1);
        }
        else {
            JOptionPane.showMessageDialog(null,"Equação sem raizes, valor do delta foi: " + delta);
        }
    }
}
