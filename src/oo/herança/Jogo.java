package oo.herança;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
			monstro.x = 10;
			monstro.y = 9;
		
		Heroi heroi = new Heroi();
			heroi.x = 10;
			heroi.y = 13;
			
		System.out.println("o monstro apresenta " + monstro.vida + " de vida restante");
		System.out.println("O heroi apresenta " + heroi.vida + " de vida restante");
		
			monstro.atacar(heroi);
			heroi.atacar(monstro);
			
			
			monstro.andar(Direcao.NORTE);
			monstro.atacar(heroi);
			heroi.atacar(monstro);

			
		System.out.println("o monstro apresenta " + monstro.vida + " de vida restante");
		System.out.println("O heroi apresenta " + heroi.vida + " de vida restante");
		
	}

}
