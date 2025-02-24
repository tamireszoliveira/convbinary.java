package view;
import controller.BinaryController;
import javax.swing.JOptionPane;
public class MainBinary {
	public static void main(String args[]) {
		BinaryController bin = new BinaryController();
		int decimal = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro até 2000"));
		if (decimal < 0 || decimal > 2000) {
			System.out.print("Valor inválido");
			return;
		}
		System.out.print("O número inserido em binário é " + bin.convbinary(decimal));
	}
}
