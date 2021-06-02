import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int notaum = Integer.parseInt(JOptionPane.showInputDialog("Digite a Primeira Nota"));
		int notadois = Integer.parseInt(JOptionPane.showInputDialog("Digite a Segunda Nota"));
		int soma = (notaum + notadois)/2;
		JOptionPane.showInternalConfirmDialog(null, "A Média das Notas é Igual a: "+soma);
	}

}
