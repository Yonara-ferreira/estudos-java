package Novo_modulo;

public class Data_teste {

	public static void main(String[] args) {

		Data d1 = new Data();
		d1.dia=15;
		d1.mes=03;
		d1.ano=2013;
		
		
		var d2 = new Data();
		d2.dia = 26;
		d2.mes = 06;
		d2.ano = 2021;

		
		System.out.printf("%d/%d/%d\n",d1.dia,d1.mes,d1.ano);
		System.out.printf("%d/%d/%d",d2.dia,d2.mes,d2.ano);

		
	}	
}
