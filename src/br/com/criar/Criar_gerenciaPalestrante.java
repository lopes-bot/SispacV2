package br.com.criar;

import br.com.Dbconnect.ConnectDb;
import br.com.Models.Gerenciapalestrante;
import java.sql.PreparedStatement;

public class Criar_gerenciaPalestrante {
    public Criar_gerenciaPalestrante(int id_subevento, int id_palestrante) {
		String sql = "INSERT INTO  possuiPalestrante(id_subevento, id_palestrante) VALUES(?,?)";	
		Gerenciapalestrante pale = new Gerenciapalestrante(id_subevento,id_palestrante);
		ConnectDb con = new ConnectDb(sql);
		
		PreparedStatement ps = con.getPs();
		
		try {
				ps.setInt(1, pale.getId_subevento());
				ps.setInt(2, pale.getId_palestrante());
				ps.execute();
				ps.close();
				
			}catch(Exception e) {
				
			System.out.println(e);
		}
	}
}
