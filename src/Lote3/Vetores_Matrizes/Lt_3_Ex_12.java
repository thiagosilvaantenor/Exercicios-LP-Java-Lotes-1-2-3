package Lote3.Vetores_Matrizes;
import javax.swing.JOptionPane;

public class Lt_3_Ex_12 {
  /*
   * 12. Carregar códigos das peças em um tabuleiro de xadrez, onde:
   * Codigo:|1  |2    |3    |4      |5     |6  |7
   * Peça: |Peão|Torre|Bispo|Cavalo|Rainha|Rei|Vazio
   * Calcular e mostrar a soma das peças do tabuleiro
   * Não pode utilizar estrutura de decisão e escolha Caso na contagem das peças
   */
  public static void main(String args[]) {
    int mat[][] = new int[8][8];
    ProcedureCarregaTabuleiro(mat);
    JOptionPane.showMessageDialog(null, "A soma das peças do tabuleiro foi: " + FunctionSomaTabuleiro(mat));
  }

  // Carregar peças na mesma posição que ficariam em um tabuleiro de xadrez
  
  static void ProcedureCarregaTabuleiro(int m[][]) {
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m.length; j++) {
        switch (j) {
          //Torre
          case 0:
          case 7:
            if((i == 0 || i == 7)){
              m[i][j] = 2;
            } else if(i == 1 || i == 6){
              m[i][j] = 1;
            } else if(i == 2 || i == 3 || i == 4 || i == 5){
              m[i][j] = 7;
            }

            break;
        //Cavalo
        case 1:
        case 6:
            if((i == 0 || i == 7)){
              m[i][j] = 4;
            }else if(i == 1 || i == 6){
              m[i][j] = 1;
            } else if(i == 2 || i == 3 || i == 4 || i == 5){
              m[i][j] = 7;
            }
            break;
        //Bispo
        case 2:
        case 5:
            if((i == 0 || i == 7)){
              m[i][j] = 3;
            }else if(i == 1 || i == 6){
              m[i][j] = 1;
            } else if(i == 2 || i == 3 || i == 4 || i == 5){
              m[i][j] = 7;
            }
        break;
      //Rei
        case 3:
            if((i == 0 || i == 7)){
              m[i][j] = 6;
            }else if(i == 1 || i == 6){
              m[i][j] = 1;
            } else if(i == 2 || i == 3 || i == 4 || i == 5){
              m[i][j] = 7;
            }
        break;
      //Rainha
        case 4:
            if((i == 0 || i == 7)){
              m[i][j] = 5;
            }else if(i == 1 || i == 6){
              m[i][j] = 1;
            } else if(i == 2 || i == 3 || i == 4 || i == 5){
              m[i][j] = 7;
            }
        break;
        }
      }
    }
  }


static int FunctionSomaTabuleiro(int m[][]) {
    int som = 0;
    for(int i = 0; i < m.length; i++){
      for(int j = 0; j < m.length; j++){
        som += m[i][j];
      }
    }
    return som;
}

}