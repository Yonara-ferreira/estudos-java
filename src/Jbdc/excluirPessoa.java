package Jbdc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class excluirPessoa {
	
	public static void main(String[] args)  throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o codigo : ");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("Pesosa excluida com sucesso!");
		}else {
			System.out.println("Erro ao excluir pessoa");
		}
		
		conexao.close();
		entrada.close();
		
	}

}
