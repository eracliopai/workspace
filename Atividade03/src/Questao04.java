import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float vlrconta = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da conta"));
		float percgarc = Integer.parseInt(JOptionPane.showInputDialog("Digite o Percentual de Comissão"));
		float garc = (percgarc/100);
		//float percent = garc;
		double comissao = (vlrconta*garc);
		double soma = (vlrconta+comissao);
		//double total = soma + vlrconta;
		JOptionPane.showInternalConfirmDialog(null, "A Comissão do Garçom é de: "+comissao);
		JOptionPane.showInternalConfirmDialog(null, "O Valor Total da Conta é de: "+soma);
	}

}
