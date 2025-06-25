package Clientes;

import java.sql.Connection;


import java.sql.SQLException;

import Conexao.Conexao;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection conexao = Conexao.criarConexao();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
