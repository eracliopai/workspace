import javax.swing.JOptionPane;

public class LeitorDados {

	public static void main(String[] args) {
		Pessoa myPessoa = new Pessoa();
		
		myPessoa.setNome(JOptionPane.showInputDialog("Digite o Nome "));
		myPessoa.setAltura(JOptionPane.showInputDialog("Altura"));
		myPessoa.setDn(Integer.parseInt(JOptionPane.showInputDialog("Dia do Nascimento :")));
		myPessoa.setMn(Integer.parseInt(JOptionPane.showInputDialog("Mes do Nascimento ;")));
		myPessoa.setAn(Integer.parseInt(JOptionPane.showInputDialog("Ano do Nascimento ;")));
		JOptionPane.showMessageDialog(null, myPessoa.lerdados());

	}

}
