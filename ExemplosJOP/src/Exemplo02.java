import javax.swing.JOptionPane;

public class Exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sexo = JOptionPane.showInputDialog("Digite M ou F para o Sexo");
		String mensagem = "";

//		if (!(sexo.length()<= 1))
//		if (sexo.length() = 1)
//		if (sexo.length() >= 2)
		if (sexo.length() > 1) {
			mensagem = "Digite Apenas 1 Caracter!";
		} else if (sexo.toUpperCase().equals("M")) {
			mensagem = "Masculino";
			JOptionPane.showInternalMessageDialog(null, "Masculino");

		}

		if (sexo.toUpperCase().equals("F")) {
			JOptionPane.showInternalMessageDialog(null, "Feminino");
			mensagem = "feminino";
		} else {
			mensagem = "Valor não encontrado!";
		}
		JOptionPane.showMessageDialog(null, mensagem);

//		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade"));
//		JOptionPane.showMessageDialog(null, "A Idade Digitada foi: " + idade);

//		if (idade >= 18) {
//			JOptionPane.showMessageDialog(null, "Ok você pode tirar uma CNH");
//		} else {
//			JOptionPane.showInternalMessageDialog(null, "Desculpe você não pode tirar uma CNH");
//			
//		}

	}

}
