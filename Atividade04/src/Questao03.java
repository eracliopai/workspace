import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	    3)Entre X e Y
//	    Entrada > "Digite 1 número"
//	    Entrada > "Digite 1 número"
//	    Saída > "Os números entre ? e ? são: ?, ?, ?, ? "
		
//		System.out.printf ("%d\t%d\t%f\t%s",5,5,254.336,"Hehe")
		
	    
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Numero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Numero: "));
		String n3 = "";
		
				
		if (n1 == n2) {
			JOptionPane.showMessageDialog(null, "Numeros Iguais");
	}
		for ( int i = n1+1; i < n2;i++) {
			//System.out.print(","+n3);
			//JOptionPane.showMessageDialog(null, ","+n3);
			n3 = n3+i + ",";			
		}
		JOptionPane.showMessageDialog(null, "Os Numeros entre: "+n1+" e "+n2+" São: "+n3);
//		while (n1 < n2) {
//		      JOptionPane.showMessageDialog(null, "Os Numeros entre: "+n1+" e "+n2+" São: ");
//		      n1++;
//	     }  
			
		
		}
		
}

