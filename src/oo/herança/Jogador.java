package oo.herança;

public class Jogador {

		int x;
		int y;
		
		boolean andar(Direcao direcao) {
			switch(direcao) {
			case NORTE:
				y--;
				break;
			case LESTE:
				x++;
				break;
			case SUL:
				x++;
				break;
			case OESTE:
				y--;
				break;
			}
			
			/*
			 * if(direcao == Direcao.NORTE ) { y++; }
			 */
			return true;
		}
	
}
