package br.com.buscas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.com.Dbconnect.ConnectDb;
import br.com.Models.Aluno;
import java.util.ArrayList;

public class FindAluno {
        private Aluno alu;

	public Aluno getAlu() {
		return alu;
	}

	public void setAlu(Aluno alu) {
		this.alu = alu;
	}
	
	public ArrayList findAll() {
		String sql = "SELECT * FROM aluno";
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps = con.getPs();
		ArrayList<Aluno> list = new ArrayList();
		try {
		
		ResultSet result =	ps.executeQuery();
		
		while(result.next()) {
			
			Aluno adm = new Aluno(
					result.getInt("id_aluno"),
					result.getString("cpf"),
					result.getString("nome"),
					result.getString("email"),
					result.getString("senha"));	
			list.add(adm);
		}
		
		ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
        
	public Aluno findOne(int id_aluno) {
		String sql = "SELECT * FROM aluno WHERE id_aluno= "+id_aluno;
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps = con.getPs();
		
		try {
		
		ResultSet result =	ps.executeQuery();
		
		
		result.next();
			Aluno alu = new Aluno(
					result.getInt("id_aluno"),
					result.getString("cpf"),
					result.getString("nome"),
					result.getString("email"),
					result.getString("senha"));	
			
			setAlu(alu);
			ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		return getAlu();
	}
	
	public Aluno Login(String email , String senha) {
		String sql = "SELECT * FROM aluno WHERE email= '"+email+"' AND senha= '"+senha+"';";
		ConnectDb con = new ConnectDb(sql);		
		PreparedStatement ps = con.getPs();
		try {
			
			ResultSet result =	ps.executeQuery();
			
			
			result.next();
				Aluno alu = new Aluno(
						result.getInt("id_aluno"),
						result.getString("cpf"),
						result.getString("nome"),
						result.getString("email"),
						result.getString("senha"));	
				
				setAlu(alu);
				ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		return getAlu();
		
	}
        
        public ArrayList<String> findAllEmails() {
		String sql = "SELECT email  FROM aluno;";
		ConnectDb con = new ConnectDb(sql);		
		PreparedStatement ps = con.getPs();
		ArrayList<String> list = new ArrayList<String>();
		
		
			try {
				ResultSet result =	ps.executeQuery();	
				
				while(result.next()) {				
					list.add(result.getString("email"));															
				}
				
					
			}catch(Exception e) {
					System.out.println(e);
			}
			
		return list;
			
	}
    public String getEmail(int id_aluno) {
    	String sql = "SELECT email FROM aluno WHERE id_aluno= "+id_aluno;
    	ConnectDb con = new ConnectDb(sql);		
		PreparedStatement ps = con.getPs();
		String emailAluno = null;
		try {
			ResultSet result =	ps.executeQuery();
			result.next();
			emailAluno = result.getString("email");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return emailAluno;
    	
    }
    public String getSenha(int id_aluno) {
    	String sql = "SELECT senha FROM aluno WHERE id_aluno= "+id_aluno;
    	ConnectDb con = new ConnectDb(sql);		
		PreparedStatement ps = con.getPs();
		String senhaAluno = null;
		try {
			ResultSet result =	ps.executeQuery();
			result.next();
			senhaAluno = result.getString("senha");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return senhaAluno;
    	
    }
    
    
}
