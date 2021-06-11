import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
		
		String Aluno = JOptionPane.showInputDialog(null,"Digite o Nome do Aluno");
		float Nota = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a Nota Final"));
		String apr = "Aprovado";
		String rec = "Recuperacao";
		String rep = "Reprovado";
		
//		1)Status Aluno
//		  Entrada > "Digite o nome do aluno"
//		  Entrada > "Digite a nota final"
//		  Saída   > "O aluno ?? esta ?? com a nota ??"
//		  // condições
//		  // nota maior ou igual 7 'Aprovado'
//		  // nota entre 4 e 7 'Recuperação'
//		  // nota menor que 4 'Reprovado'
				

//		float nmaior = 7;
//		float nmenor = 4;
		float numero = 0;
		
		
		if (Nota >= 7) {
			numero = Nota;	
			JOptionPane.showMessageDialog(null,"O Aluno "+Aluno+ " Esta "+apr+ " com a Nota : "+numero);
		} else if (Nota < 4) {
			numero = Nota;
			JOptionPane.showMessageDialog(null,"O Aluno "+Aluno+ " Esta "+rep+ " com a Nota : "+numero);
		} else if (Nota >= 4 && Nota <= 7) {
			numero = Nota;		
			JOptionPane.showMessageDialog(null,"O Aluno "+Aluno+ " Esta em "+rec+ " com a Nota : "+numero);
		}
	}

}
		


