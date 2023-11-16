package Lote1.Estrutura_Repeticao;
import javax.swing.JOptionPane;

public class Lt_1_Ex_35 {
  // 35.	Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
  public static void main(String args[]){
      int n1,n2,maior,menor;

      n1 = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe um número inteiro"));
      n2 = Integer.parseInt(JOptionPane.showInputDialog("Agora, informe outro número inteiro"));


      if(n1 > n2){
        maior = n1;
        menor = n2;
      }
      else {
        maior = n2;
        menor = n1;
      }

     
      JOptionPane.showMessageDialog(null,"A soma dos números impares entre:\n" + menor + " e " + maior + " é: " + FunctionSomaImpares(maior, menor));
  }

  static int FunctionSomaImpares(int maior,int menor){
    int somaImpares = 0;

    for(int i = menor; i < maior; i++){
        if(i % 2 != 0){
          somaImpares += i;  
        }
    }
    return somaImpares;
  }
}
