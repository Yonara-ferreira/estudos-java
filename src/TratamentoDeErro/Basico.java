package TratamentoDeErro;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimiNomeDoAluno(a1);
		} catch(Exception excecao) {
			System.out.println("ocorreu o erro no momento de " + 
								"de imprimir o nome de usuario");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("fim hihihih");
	}
	
	public static void imprimiNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
		
	}
}
