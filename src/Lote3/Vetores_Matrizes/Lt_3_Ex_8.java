package Lote3.Vetores_Matrizes;
import javax.swing.JOptionPane;

public class Lt_3_Ex_8 {
    /* Criar e carregar uma matriz[4][3] inteiro com quantidade
    de produtos vendidos em 4 semanas, calcular e exibir:
    quantidade de cada produto vendido no mês;
    quantidade de produtos vendidos na semana;
    o total vendido no mês
    */

    static int qntVendasM[] = new int[3], qntVendasS[] = new int[4];

    public static void main(String args[]){
        int matriz[][] = new int[4][3];
            
        ProcedureCarregaMatriz(matriz);
        ProcedureCalcVendasM(matriz);
        ProcedureCalcVendasS(matriz);
        
        JOptionPane.showMessageDialog(null, "O valor de cada produto vendidos no mês foi: ");
        ProcedureMostraVetor(qntVendasM);
        JOptionPane.showMessageDialog(null, "Jà o valor de vendas em cada semana foi ");
        ProcedureMostraVetor(qntVendasS);
        JOptionPane.showMessageDialog(null, "Por fim, o total de vendas foi: " + FunctionCalcTotal(matriz));
        
    }

    static void ProcedureCarregaMatriz(int m[][]){
        for(int i = 0; i < m.length; i++){
            for(int j =0; j < 3; j++){
                m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe a venda do produto " + j + "\nDurante a semana " + i));
            }
        }
    }

    static void ProcedureCalcVendasM(int m[][]){
        for(int i = 0; i < m.length; i++){
           for(int j = 0; j < 3; j++){
                qntVendasM[j] += m[i][j];
           } 
        }
    }

    static void ProcedureCalcVendasS(int m[][]){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < 3; j++){
                qntVendasS[i] += m[i][j]; 
            }
        }
    }

    static int FunctionCalcTotal(int m[][]){
        int total = 0;
        for(int i = 0; i < m.length; i ++){
            for(int j = 0; j < 3; j++){
                total += m[i][j]; 
            }
        }
        return total;
    }

    static void ProcedureMostraVetor(int v[]){
        for(int i = 0; i < v.length; i++){
                JOptionPane.showMessageDialog(null,v[i]);
            }
    }

}
