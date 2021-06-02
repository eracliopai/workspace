import javax.swing.JOptionPane;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Olá Mundo JOP", "!!Alerta!!", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "!!aLERTA!!", JOptionPane.YES_NO_OPTION);
		Object[] options = { "OK", "Cancelar", "Voltar" };
		JOptionPane.showOptionDialog(null, "Clique OK para Continuar!", "Alerta", JOptionPane.DEFAULT_OPTION,
				JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		String nome = JOptionPane.showInputDialog("Digite Seu Nome!");
		System.out.println("O Nome Digitado Foi: "+nome);
				
		Object[] itens = {"Maçã" , "Pêra" , "Banana"};
		Object itemSelecionado = JOptionPane.showInputDialog(null, "Escolha 1 Item","itens",JOptionPane.INFORMATION_MESSAGE,
				null,itens,itens[1]);
		System.out.println("O Item Selecionado foi: "+itemSelecionado.toString());
		
	}

}
