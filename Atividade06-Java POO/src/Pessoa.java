import java.time.LocalDate;

public class Pessoa {
	
//	Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de
//	nascimento e altura;
//	Crie os m�todos p�blicos necess�rios para sets e gets e tamb�m um
//	m�todo para imprimir todos dados de uma pessoa;
//	Crie um m�todo para calcular a idade
//	da pessoa;
//	Crie uma nova classe com o m�todo main;
//	Crie um objeto da classe anterior;
//	Crie um fluxo com o JOptionPane para preencher o objeto e apesentar as informa��es desse objeto.
	
	private String nome;
	private String altura;
	private int dn;
	private int mn;
	private int an;
	
	public int Idade() {
		LocalDate agora = LocalDate.now();
		int anoatual = agora.getYear();
		int idade = anoatual - getAn();
		return idade;
	}
	
	public String lerdados() {
		return "Dados" 
				+" \nNome :"+getNome() 
				+ "\nAltura :"+getAltura()
				+ "\nData de Nascimento :"+getDn()+ "/"+getMn() + "/"+getAn()
				+ "\nIdade :"+Idade();
		
	}
	
	public String getNome() {
		return nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public int getDn() {
		return dn;
	}
	public void setDn(int dn) {
		this.dn = dn;
	}
	public int getMn() {
		return mn;
	}
	public void setMn(int mn) {
		this.mn = mn;
	}
	public int getAn() {
		return an;
	}
	public void setAn(int an) {
		this.an = an;
	}
	
}
