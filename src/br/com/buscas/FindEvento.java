package br.com.buscas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.com.Dbconnect.ConnectDb;
import br.com.Models.Evento;
import java.util.ArrayList;

public class FindEvento {
        private Evento ev;
	
	public Evento getEv() {
		return ev;
	}
	public void setEv(Evento ev) {
		this.ev = ev;
	}
	
	public ArrayList findAll() {
		String sql = "SELECT * FROM evento";
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps = con.getPs();
		ArrayList<Evento> list = new ArrayList();
		try {
		
		ResultSet result =	ps.executeQuery();
		
		while(result.next()) {
			
			Evento even = new Evento(
					result.getInt("id_evento"),
					result.getString("nomeevento"),
					result.getString("endereco"),
					result.getString("datainicio"),
					result.getString("datafim"),
					result.getString("horainicio"),
					result.getString("horafim"),
					result.getString("area"),
					result.getString("vagas"),
					result.getString("cargahoraria")					
					);
			list.add(even);
		}
		
		ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return list;
		
	}
	public Evento findOne(int id_evento) {
		String sql = "SELECT * FROM evento WHERE id_evento= "+id_evento;
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps = con.getPs();
		
		try {
		
		ResultSet result =	ps.executeQuery();
		
		
		result.next();
			
		Evento even = new Evento(
				result.getInt("id_evento"),
				result.getString("nomeevento"),
				result.getString("endereco"),
				result.getString("datainicio"),
				result.getString("datafim"),
				result.getString("horainicio"),
				result.getString("horafim"),
				result.getString("area"),
				result.getString("vagas"),
				result.getString("cargahoraria")					
				);
			setEv(even);
			ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		return getEv();
	}
}
