package br.com.criar;

import br.com.CoisasUteis.GeradorId;
import br.com.Dbconnect.ConnectDb;
import java.sql.PreparedStatement;
import br.com.Models.Administrador;

public class Criar_admin {
    public Criar_admin( String cnpj,String senha, String nome, String email ) {
        GeradorId idGerado = new GeradorId();
		int id_admin = idGerado.id_admin();
		String sql = "INSERT INTO administrador (id_admin,cnpj,senha,nome,email) VALUES(?,?,?,?,?)";	
		Administrador adm = new Administrador(id_admin,cnpj,senha,nome,email);


		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps =con.getPs();
		try {
			ps.setInt(1, adm.getId_admin());
			ps.setString(2, adm.getCpf());
			ps.setString(3, adm.getSenha());
			ps.setString(4, adm.getNome());
			ps.setString(5, adm.getEmail());
			ps.execute();
			ps.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
