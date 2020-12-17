package br.com.buscas;

import br.com.Dbconnect.*;
import br.com.Models.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FindPalestrante {
     private Palestrante palestrante;

		public Palestrante getPalestrante() {
			return palestrante;
		}

		public void setPalestrante(Palestrante palestrante) {
			this.palestrante = palestrante;
		}

		public Palestrante findOne(int id_subevento) {
			System.out.println(findPalestrante(id_subevento));
			String sql = "SELECT * FROM palestrante WHERE id_palestrante ="+findPalestrante(id_subevento);
			ConnectDb con = new ConnectDb(sql);
			PreparedStatement ps = con.getPs();
			
			try {
			
			ResultSet result =	ps.executeQuery();
			
			System.out.println(result);
			result.next();
				Palestrante pal = new Palestrante(
						result.getInt("id_palestrante"),
						result.getString("nomecompleto"),
						result.getString("email"),
                        result.getString("telefone"));	
				
				setPalestrante(pal);
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
			return getPalestrante();
		}
		
		public int findPalestrante(int id_sub) {
			String sql = "SELECT id_palestrante FROM possuipalestrante WHERE id_subevento ="+id_sub+";";
			ConnectDb con = new ConnectDb(sql);
			PreparedStatement ps = con.getPs();
			int id_palestrante = 0;
			try {
			
			ResultSet result =	ps.executeQuery();
			

			result.next();
			id_palestrante = result.getInt("id_palestrante");
			ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
			return id_palestrante;
		}
}