import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2)Maior n�mero
//	    Entrada > "Digite 1 n�mero"
//	    Entrada > "Digite 1 n�mero"
//	    Sa�da   > "O maior n�mero � ??"
//	    condi��es
//	    se os n�meros digitados forem igual a sa�da deve ser "N�mero iguais."
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Numero"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Numero"));
		
		double n3 = Math.max(n1, n2);
		
		if (n1 == n2) {
			JOptionPane.showMessageDialog(null, "Numeros Iguais");
		}else {
			JOptionPane.showMessageDialog(null, "O Maior Numero �: "+n3);
		}
		
		
	}

}
