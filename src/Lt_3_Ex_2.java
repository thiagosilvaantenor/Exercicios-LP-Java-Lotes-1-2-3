import javax.swing.JOptionPane;

public class Lt_3_Ex_2 {
    
    public static void main(String args[]){
        //criar e coletar um vetor 100 inteiro e exibir o maior e menor, media
        int vet[] = new int[100];
        int maior=0,menor=9999;
        
        for(int i = 0; i <= 10; i++){
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe um número inteiro"));
             if(i == 0){
                maior = vet[i];
                menor = vet[i];
            }
            else{
                if(vet[i] > maior)
                    maior = vet[i];
                if(vet[i] < menor)
                    menor = vet[i];
            }
        }
        
        
        
        System.out.println("O maior valor do vetor é: " + maior + "\nO menor valor é: " + menor+"\nA média dos números é: "+ Media(vet));
    }
   
    
   static double Media(int vet[]){
       int i, media=0;
       
       for(i = 0; i <= 10; i++){
           media += vet[i];
       }
       media = media / i;
       return media;
   }
    
}
