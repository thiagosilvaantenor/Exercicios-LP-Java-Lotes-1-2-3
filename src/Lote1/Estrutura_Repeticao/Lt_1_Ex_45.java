package Lote1.Estrutura_Repeticao;
import javax.swing.JOptionPane;
public class Lt_1_Ex_45 {
  // 45.	Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
  public static void main(String args[]){
      JOptionPane.showMessageDialog(null, "O valor de serie é: " + FunctionSerie45()); 
  }
 static double FunctionSerie45(){
     double serie;
     serie = 1.0;
     
     for(double i= 2.0; i <= 15.0; i++){
         if(i % 2 == 0)
             serie = serie - (i/(i*i));
         else
             serie = serie + (i/(i*i));
    }
    
    return serie;
 }
}
