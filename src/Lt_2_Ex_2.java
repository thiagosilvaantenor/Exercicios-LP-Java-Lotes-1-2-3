import javax.swing.JOptionPane;

public class Lt_2_Ex_2 {
    //2)   Serie2 = (N) + (N-1) + (N-2) + ... + (1) 
    public static void main(String args[]){
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe um valor inteiro"));
        JOptionPane.showMessageDialog(null, "O valor final é: " + FunctionRecursividadeDois(num));
    }
    
    static int FunctionRecursividadeDois(int n){
        int i;
        if(n != 1){
            i = n + FunctionRecursividadeDois(n-1);
            return i;
        }
        else{
            return n;
        }
    }
    
}
