package Lote1.Estrutura_Decisao;
import javax.swing.JOptionPane;

public class Lt_1_Ex_26 {
  /* 26.	Receba 2 números inteiros. 
  Verifique e mostre se o maior número é múltiplo do menor.*/
    static int maior,menor;
  public static void main(String args[]){
      int n1,n2;
      n1 = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe um número inteiro"));
      n2 = Integer.parseInt(JOptionPane.showInputDialog("Agora, informe outro número inteiro"));
      
      ProcedureMultiplo(n1,n2);
  }
  
  static void ProcedureMultiplo(int n1,int n2){
      //Verifica quem é o maior
      if(n1 > n2){
        maior = n1;
        menor = n2;
      } else{
        maior = n2;
        menor = n1;
      }
      
      //verifica se o maior é multiplo do menor
      if(maior % menor == 0){
        JOptionPane.showMessageDialog(null,"O número maior é multiplo do número menor\nMaior: " + maior + "\nMenor: " + menor);
      } else{
        JOptionPane.showMessageDialog(null,"O número maior não é multiplo do menor\nMaior: " + maior + "\nMenor: " + menor);
      }
  }
}
