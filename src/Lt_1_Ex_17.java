import javax.swing.JOptionPane;

public class Lt_1_Ex_17 {
  //17.	Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
    //Receber o tempo de percurso e a velocidade média
  static double litros,velocidadeMed,tempo;
  public static void main(String args[]){
      
      tempo = Double.parseDouble(JOptionPane.showInputDialog("Olá, informe o tempo de percurso"));
      velocidadeMed = Double.parseDouble(JOptionPane.showInputDialog("Agora, informe a velocidade média"));

      ProcedureLitros();
               
      JOptionPane.showMessageDialog(null,"A quantidade de litros que será gasta nessa viagem será: " + litros);
      
    }
  
  static void ProcedureLitros(){
      litros = (tempo * velocidadeMed) / 12;
  }
}
