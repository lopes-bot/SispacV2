package br.com.criar;

import br.com.CoisasUteis.GeradorId;
import br.com.CoisasUteis.Gerador_senha;
import br.com.Dbconnect.ConnectDb;
import br.com.Models.Aluno;
import br.com.email.EmailSenha;
import java.sql.PreparedStatement;

public class Criar_aluno {
    public Criar_aluno(String cpf,String nome,String email) {
        GeradorId idGerado = new GeradorId();
        Gerador_senha senha = new Gerador_senha();
        int id_aluno = idGerado.id_aluno();
		String sql = "INSERT INTO aluno(id_aluno,cpf,nome,email,senha) VALUES(?,?,?,?,?)";	
		Aluno alu = new Aluno(id_aluno,cpf,nome,email,senha.getSenha());

		ConnectDb con = new ConnectDb(sql);
		
		PreparedStatement ps = con.getPs();
		
		try {
				ps.setInt(1, alu.getId_aluno());
				ps.setString(2, alu.getCpf());
				ps.setString(3, alu.getNome());
				ps.setString(4, alu.getEmail());
				ps.setString(5, alu.getSenha());				
				ps.execute();
				ps.close();
							
			}catch(Exception e) {
				
			System.out.println(e);
		}
        EmailSenha envioEmail = new EmailSenha(id_aluno);
	}
}
