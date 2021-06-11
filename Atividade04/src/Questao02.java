import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2)Maior número
//	    Entrada > "Digite 1 número"
//	    Entrada > "Digite 1 número"
//	    Saída   > "O maior número é ??"
//	    condições
//	    se os números digitados forem igual a saída deve ser "Número iguais."
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Numero"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Numero"));
		
		double n3 = Math.max(n1, n2);
		
		if (n1 == n2) {
			JOptionPane.showMessageDialog(null, "Numeros Iguais");
		}else {
			JOptionPane.showMessageDialog(null, "O Maior Numero é: "+n3);
		}
		
		
	}

}
