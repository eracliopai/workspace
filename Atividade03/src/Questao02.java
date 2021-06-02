import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite O Primeiro Numero"));
		int ndois = Integer.parseInt(JOptionPane.showInputDialog("Digite O Segundo Numero"));
		int soma = num + ndois;
		JOptionPane.showInternalConfirmDialog(null, "A Soma dos Numeros é Igual a: "+soma);
	}

}
