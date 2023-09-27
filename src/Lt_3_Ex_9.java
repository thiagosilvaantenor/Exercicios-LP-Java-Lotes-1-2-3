import javax.swing.JOptionPane;

public class Lt_3_Ex_9 {
    /*
     * Criar e carregar uma [4][4] com valores aleatórios,
     * sendo que diagonal principaç terá seus dados carregados no programa segundo:
     * |0|1|2 |3 |
     * 0|1| | | |
     * 1| |4| | |
     * 2| | |16| |
     * 3| | | |64|
     */
    public static void main(String args[]) {
        int matriz[][] = new int[4][4];

        ProcedureCarregaMDiagonalExclusiva(matriz);
        ProcedureMostraMatriz(matriz);
    }

    static void ProcedureCarregaMDiagonalExclusiva(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i == j)
                    m[i][j] = (int) Math.pow(4, i);
                else
                    m[i][j] = Integer.parseInt(JOptionPane
                            .showInputDialog("Olá, informe o valor que ficará na linha: " + i + "\nE na coluna: " + j));
            }
        }
    }

    static void ProcedureMostraMatriz(int m[][]){
        JOptionPane.showMessageDialog(null, "Mostrando matriz completa...");
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                JOptionPane.showMessageDialog(null,m[i][j]);
            }
        }
    }
}
