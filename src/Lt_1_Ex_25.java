import javax.swing.JOptionPane;
public class Lt_1_Ex_25 {
/*25.	Receba a hora de início e de final de um jogo (HH,MM)
 ,calcular o tempo do jogo em horas e minutos
 sabendo que o tempo máximo é menor que 24 horas e pode
 começar num dia e terminar noutro.*/
 
    static int horaJ,minutoJ ;
    public static void main(String args[]) {
        int horaI,horaF,minutoI,minutoF;

        horaI = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe a hora de inicio do jogo"));
        horaF = Integer.parseInt(JOptionPane.showInputDialog("Agora, informe a hora que o jogo acabou"));
        minutoI = Integer.parseInt(JOptionPane.showInputDialog("Também informe o minuto que iniciou o jogo"));
        minutoF = Integer.parseInt(JOptionPane.showInputDialog("Por fim, informe o minuto em que acabou o jogo"));

        ProcedureTempoJogo(horaI,horaF,minutoI,minutoF);
        
    }
    
    static void ProcedureTempoJogo(int horaI,int horaF,int minutoI,int minutoF){
        
        // Horas
        if (horaI > horaF) {
            horaJ = (horaF + 24) - horaI;
        } else{
            horaJ = horaF - horaI;
        }
        // Minutos
        if (minutoI > minutoF) {
            minutoJ = (minutoF + 60) - minutoI;
        } else{
            minutoJ = minutoF - minutoI;
        }
        // Saída
        if (horaJ <= 23) {
            JOptionPane.showMessageDialog(null, "O tempo de duração do jogo foi: " + horaJ + " hora e " + minutoJ + " minutos");
        } else {
            JOptionPane.showMessageDialog(null, "Jogo ultrapassou 23 horas de duração");
        }
    }
}
