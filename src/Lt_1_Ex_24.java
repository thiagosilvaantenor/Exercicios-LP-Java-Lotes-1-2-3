import javax.swing.JOptionPane;

public class Lt_1_Ex_24 {
    //receba um valor int verifique e mostre se é divisivel por 2 ou 3
    static int num;
    public static void main(String args[]){
        num = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe um valor inteiro"));
        ProcedureDivisivel();
    }
 
    static void ProcedureDivisivel(){
        if(num % 2 == 0 && num % 3 == 0){
            JOptionPane.showMessageDialog(null,"O número: " + num + ", é divisivel por 2 e 3");
        } 
        else if(num % 2 == 0 && num % 3 != 0){
                JOptionPane.showMessageDialog(null,"O número: " + num + ", é divisivel por 2, mas não por 3");
            }
        else if (num % 3 == 0 && num % 2 != 0){
                JOptionPane.showMessageDialog(null, "O número: " + num + ", é divisivel por 3, mas não por 2");
        }
        else {
            JOptionPane.showMessageDialog(null,"O número: " + num + ", não é divisivel por 2 e 3");
        }
    }
    
}
