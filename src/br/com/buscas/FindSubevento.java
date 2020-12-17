package br.com.buscas;

import  java.sql.PreparedStatement ;
import  java.sql.ResultSet ;

import  br.com.Dbconnect.ConnectDb ;
import  br.com.Models.Evento ;
import  br.com.Models.Subevento ;
import java.util.ArrayList;

public class FindSubevento {
        private Subevento sub;

	public Subevento getSub() {
		return sub;
	}

	public void setSub(Subevento sub) {
		this.sub = sub;
	}
	public ArrayList findAll(int id_evento) {
		String sql = "SELECT * FROM subevento WHERE id_evento= "+id_evento;
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps = con.getPs();
		ArrayList<Subevento> list = new ArrayList();
		try {
		
		ResultSet result =	ps.executeQuery();
		
		while(result.next()) {
			
			Subevento sub = new Subevento(
					result.getInt("id_evento"),
					result.getInt("id_subevento"),
					result.getString("cargahoraria"),
					result.getString("nomesubevento"),
					result.getString("endereco"),
					result.getString("horainicio"),
					result.getString("horafim"),
					result.getString("datasub"),
					result.getString("vagas")					
					);
			
			list.add(sub);
		}
		
		ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return list;
		
	}
	public Subevento findOne(int id_evento , int id_subevento) {
		String sql = "SELECT * FROM subevento WHERE id_evento= "+id_evento+"AND id_subevento="+id_subevento+"";
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps = con.getPs();
		
		try {
			ResultSet result =	ps.executeQuery();
			result.next();
			Subevento sub = new Subevento(
					result.getInt("id_evento"),
					result.getInt("id_subevento"),
					result.getString("cargahoraria"),
					result.getString("nomesubevento"),
					result.getString("endereco"),
					result.getString("horainicio"),
					result.getString("horafim"),
					result.getString("datasub"),
					result.getString("vagas")					
					);
		
			setSub(sub);
			ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		return getSub();
	}
}
