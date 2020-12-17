package br.com.criar;

import br.com.CoisasUteis.GeradorId;
import br.com.Dbconnect.ConnectDb;
import br.com.Models.Palestrante;
import java.sql.PreparedStatement;

public class Criar_palestrante {
    public Criar_palestrante(int idSubevento, String nomecompleto, String email, String telefone) {
        GeradorId idGerado = new GeradorId();
        int id_palestrante = idGerado.id_palestrante();
		String sql = "INSERT INTO palestrante(id_palestrante,nomecompleto,email,telefone) VALUES(?,?,?,?)";	
		Palestrante pale = new Palestrante(id_palestrante,nomecompleto,email, telefone);
		ConnectDb con = new ConnectDb(sql);
		
		PreparedStatement ps = con.getPs();
		
		try {
				ps.setInt(1,pale.getId_palestrante());
				ps.setString(2, pale.getNomecompleto());
				ps.setString(3, pale.getEmail());
				ps.setString(4, pale.getTelefone());
				ps.execute();
				ps.close();
				
			}catch(Exception e) {
				
			System.out.println(e);
		}
	}
}
