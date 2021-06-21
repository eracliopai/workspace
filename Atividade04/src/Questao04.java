import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  //4)Palavra de acesso
	  //Entrada > "Digite a palavra de acesso"
	  //Saída   > "Permissão: ??"
	  // condições
	  // se palavra digitada igual a Java-2021 Permissão: aprovada
	  // se palavra digitada diferente de Java-2021 Permissão: Tente novamente N tentativas
	  // limitar em 5 tentativas
	  //>> use o método equals
		
	//DESCULPA PROFESSOR - ESSA ROTINA EU TIVE QUE COPIAR!	
		
		for (int i = 1; 1 <= 5; i++) {
			String Palavra = JOptionPane.showInputDialog("Digite a Palvra de Acesso");
			if (Palavra.equals("Java-2021")) {
				JOptionPane.showMessageDialog(null, "Permissão Aprovada");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Tente Novamente "+i+" Tentativas");
			}
					
		
		}
		
	}

}
