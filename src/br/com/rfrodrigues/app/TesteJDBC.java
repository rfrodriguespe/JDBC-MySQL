package br.com.rfrodrigues.app;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.rfrodrigues.util.ConnectionUtil;

public class TesteJDBC {

	public static void main(String[] args) {
		try {
			Connection conn = null;
			conn = ConnectionUtil.getConnection();
			if (conn.getMetaData().getDatabaseProductName().equals("MySQL")) {
				System.out.println("A conexão com o banco foi realizada com sucesso");
			}
			conn.close();
		} catch (SQLException e) {
			System.out.println("Falaha na conexão com o SGDB" + e.getMessage());
		}

	}

}
