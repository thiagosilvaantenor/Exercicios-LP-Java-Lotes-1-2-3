import javax.swing.JOptionPane;

public class Lt_3_Ex_1 {
    //criar e coletar vetor[50], calcule e exiba a média dos valores entre
    //10 e 200, além da soma dos números impares
    public static void main(String args[]){
        int vet[] = new int[50];
        int soma=0;
        double media = 0;
        int numMedia = 0;
    
        for (int i = 0; i <= 49; i++){
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe o número " + i));
            if(vet[i] % 2 != 0){
                soma += vet[i]; 
            }
        }
        
        for(int i = 0 ; i <= 49; i++){
            if(vet[i] >= 10 && vet[i] <= 200){
                media += vet[i]; 
                numMedia++;
            }
        }
        media = media / numMedia;
        JOptionPane.showMessageDialog(null, "O valor da média dos valores entre 10 e 200 é: " + media+"\nJá a soma dos impares é: " + soma);
    }
    
}
