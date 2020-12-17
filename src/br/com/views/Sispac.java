package br.com.views;

import br.com.migrates.MigrateUP;
import br.com.pdf.Gerar;
import br.com.editar.*;

import java.sql.SQLException;

import br.com.CoisasUteis.Gerador_senha;
import br.com.Models.Palestrante;
import br.com.buscas.FindPalestrante;
import br.com.criar.*;
import br.com.delete.*;
import br.com.email.EmailSenha;
import br.com.email.JavaMailApp;
import br.com.email.RecuperaSenha;
import br.com.migrates.MigrateDown;

public class Sispac {
    public static void main(String[] ags) throws SQLException {
	System.out.println("ok");
         FindPalestrante fP1 = new FindPalestrante();
        Palestrante p1 = fP1.findOne(4);
        System.out.println(p1);
        //MigrateUP migrates = new MigrateUP();// cria as tabelas no banco 
	//MigrateDown migrates = new MigrateDown();// remove as tabelas do banco
    	//Gerador_senha g = new Gerador_senha();
    	//try {
			//Gerar g = new Gerar(3);
		//} catch (SQLException e) {
			//e.printStackTrace();
		//}
	//Criar_admin ad = new Criar_admin(1,"789456123","teste","escola fundamental","ef@gmail.com");
	//Criar_aluno al = new Criar_aluno(21,"00544764e6","Luan","andrelopessfla@gmail.com","a23re");
	/*Criar_evento ev = new Criar_evento(78,"Ecop",
		"Ufersa campus pdf","10/05/2021",
		"15/10/2021","10:00","17:00","tecnologia","110","200");
	/*
	//Criar_subevento sub = new Criar_subevento(1 , 1,"10","palestra sobre computadores modernos"
		//,"Ufersa campus pdf","10:25","11:25","10/05/2021","15");*/
	
	//Criar_palestrante pale = new Criar_palestrante(1,"Jose da silva","silva@gmail.com","(88)99587-4567");
	//gerencia palestrante tem que ser criado  depois de subevento e palestrante
	//Criar_gerenciaPalestrante gp = new Criar_gerenciaPalestrante(1,1);

	//Editar_admin ed1 = new Editar_admin(1);//necessario passar o id_admin
	//ed1.EditarEmail("segundo@gmail");
	//ed1.EditarSenha("4234");
	//ed1.EditarNome("segundão");
		
	//Editar_aluno ed2 = new Editar_aluno(1);//necessario passar o id_aluno
	//ed2.EditarSenha("testando senha");
	//ed2.EditarEmail("aluno@gmail");
	//ed2.EditarNome("Ganbiarra");
	
	//Editar_palestrante p = new Editar_palestrante(1);//necessario passar o id_palestrante
	//p.EditarSenha("dsadhiah");
	//p.EditarEmail("novo@gmail");
	//p.EditarNome("André Lopes");
	//p.EditarTelefone("3422-8446");
	
		
	//Editar_evento ev = new Editar_evento(1);//necessario passar p id_evento
	//ev.EditarCargaHoraria("200");
	//ev.EditarNome("olimpiada de fisica");
	//ev.EditarEndereco("Iracema - ce");
	//ev.EditarHoraInicio("09:00");
	//ev.EditarHoraTermino("13:00");
	//ev.EditarDataInicio("20/08/2020");
	//ev.EditarDataTermino("05/09/2020");
	//ev.EditarArea("Biologicas");
	//ev.EditarVagas("110");
		
	//Editar_subevento s = new Editar_subevento(1);//necessario passar p id_subevento
	//s.EditarCargaHoraria("10");
	//s.EditarEndereco("sala 10 bloco A");
	//s.EditarHoraInicio("13:00");
	//s.EditarHoraTermino("17:00");
	//s.EditarNome("super poderes");
	//s.EditarVagas("3");
	//s.EditarData("10/01/2021");
		
	//Delete_admin d1 = new Delete_admin(1);
	//Delete_aluno d2 = new Delete_aluno(1);
	//Delete_evento d3 = new Delete_evento(1);
        //Delete_subevento d4 = new Delete_subevento(1);
	//Delete_palestrante d5 = new Delete_palestrante(1);
        //JavaMailApp email = new JavaMailApp (1);
    	//EmailSenha senha = new EmailSenha(3);
    	//RecuperaSenha rs = new RecuperaSenha("victorcfalx555@gmail.com","adm");
        //Gerar gr = new Gerar(3);
        /*Gerador_senha senha = new Gerador_senha();
        System.out.println(senha.getSenha());*/
    }
}

