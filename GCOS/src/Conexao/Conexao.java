package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	
	static final String URL = "jdbc:postgresql://localhost:5432/bd_gcos";
	static final String USER = "postgres";
	static final String PASS = "root";
	
	public static Connection criarConexao() throws ClassNotFoundException, SQLException{
		Class.forName("org.postgresql.Driver");
		Connection conecta = DriverManager.getConnection(URL, USER, PASS);
		if (conecta != null){
		System.out.println("Sucesso");
		return conecta;
			
		}
		return null;
	}

}
