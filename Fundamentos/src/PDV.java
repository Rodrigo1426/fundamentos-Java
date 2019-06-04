import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

public class PDV {

	double valor;
	double desconto;
	double troco;
	
	public static void main(String[] args) {
		
		// Date -> trabalhar com data
		Date data = new Date();
		
		//formatar a data
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
		DecimalFormat resultado = new DecimalFormat("0.00");
		double total, desconto, totalDesconto, pago, troco;
		Scanner leia = new Scanner(System.in);
		System.out.println(formatador.format(data));
		
		System.out.println("================");
		System.out.println("======PDV=======");
		System.out.println("================");
		System.out.println("");
		System.out.println("Valor total: ");
		total = leia.nextDouble();
		
		System.out.println("Desconto em %: ");
		desconto = leia.nextDouble();
		totalDesconto = total - (desconto * total) / 100;
		
		System.out.println("Total com desconto: " + resultado.format(totalDesconto));
		System.out.println("____________________________");
		System.out.println("");
		System.out.println("Valor pago: ");
		pago = leia.nextDouble();
		troco = pago - totalDesconto;
		
		System.out.println("Troco: ");
		leia.close();
	}	
}
