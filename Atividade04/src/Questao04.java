import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  //4)Palavra de acesso
	  //Entrada > "Digite a palavra de acesso"
	  //Sa�da   > "Permiss�o: ??"
	  // condi��es
	  // se palavra digitada igual a Java-2021 Permiss�o: aprovada
	  // se palavra digitada diferente de Java-2021 Permiss�o: Tente novamente N tentativas
	  // limitar em 5 tentativas
	  //>> use o m�todo equals
		
	//DESCULPA PROFESSOR - ESSA ROTINA EU TIVE QUE COPIAR!	
		
		for (int i = 1; 1 <= 5; i++) {
			String Palavra = JOptionPane.showInputDialog("Digite a Palvra de Acesso");
			if (Palavra.equals("Java-2021")) {
				JOptionPane.showMessageDialog(null, "Permiss�o Aprovada");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Tente Novamente "+i+" Tentativas");
			}
					
		
		}
		
	}

}
