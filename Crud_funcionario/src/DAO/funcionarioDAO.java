package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import DTO.funcionarioDTO;

public class funcionarioDAO {
	
	Connection conn;
	
	
	public ResultSet cadastroUsuario(funcionarioDTO objdto) {
		
		conn = new connectionDAO().conectaBD();
		
		String nomef = objdto.getNome_funcionario();
		String numerof = objdto.getNumero_funcionario();
		String enderecof = objdto.getNumero_funcionario();
		
		try {
			String sql = "insert into funcionarios (nome_funcionario, endereco_funcionario, numero_funcionario) values(?,?,?) ";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, nomef);
			ps.setString(2, enderecof);
			ps.setString(3, numerof);
			
			ResultSet rs = ps.executeQuery();
			
			
	
			return rs;
			
		} catch (SQLException e) {
			
			
			
			JOptionPane.showMessageDialog(null, "funcionarioDAO" + e);
			
			
			
			
			return null;
		}
		
		
		
		
		
	
		
		
		
		
		
	}

}
