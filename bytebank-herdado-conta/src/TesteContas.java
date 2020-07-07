import java.util.ArrayList;

public class TesteContas {

	public static void main(String[] args) {
					
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		int[] numeros = new int[6];
		int[] refs = {1,2,3,4,5,6,7,8};
		System.out.println(refs[6]);
		cc.transfere(10.0, cp);
		double precos[] = new double[5];
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
		ArrayList<String> numer = new ArrayList<String>();
		ArrayList<String> nomes = new ArrayList<String>();
		
		throw new ArithmeticException();

	}

}
//java.lang.System java.lang.String  java.lang.System.out