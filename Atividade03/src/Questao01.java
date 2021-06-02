import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero	"));
		int v1 = numero - 1;
		int v2 = numero + 1;
		JOptionPane.showConfirmDialog(null, "Os Vizinhos são:" + v1 + " e " + v2);
	}

}
