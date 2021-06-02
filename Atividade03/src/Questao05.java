import javax.swing.JOptionPane;

public class Questao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nhoras = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Horas Trabalhadas"));
		float vhoras = Integer.parseInt(JOptionPane.showInputDialog("Valor da Hora"));
		float total = (nhoras * vhoras);
		JOptionPane.showInternalMessageDialog(null, "O Salário do Funcionário e:  " + total);
	}

}
