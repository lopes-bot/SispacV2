package br.com.email;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import br.com.Dbconnect.ConnectDb;
import br.com.buscas.FindAluno;

public class RecuperaSenha {

	public RecuperaSenha(String email, String usr) {
		Properties props = new Properties();
	    /** Par�metros de conex�o com servidor Gmail */
	    props.put("mail.smtp.host", "smtp.gmail.com");
	    props.put("mail.smtp.socketFactory.port", "465");
	    props.put("mail.smtp.socketFactory.class",
	    "javax.net.ssl.SSLSocketFactory");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.port", "465");

	    Session session = Session.getDefaultInstance(props,
	      new javax.mail.Authenticator() {
	           protected PasswordAuthentication getPasswordAuthentication()
	           {
	                 return new PasswordAuthentication("evesispac@gmail.com", "cf92787414");
	           }
	      });

	    /** Ativa Debug para sess�o */
	    session.setDebug(true);
	    
	    try {
	    	
	    	 Message message = new MimeMessage(session);
	  	      message.setFrom(new InternetAddress("evesispac@gmail.com"));
	  	      //Remetente

	  	      Address[] toUser = InternetAddress //Destinat�rio(s)
	  	                 .parse(email);

	  	      message.setRecipients(Message.RecipientType.TO, toUser);
	  	      message.setSubject("Recuperação de senha");//Assunto
	  	      if(usr == "adm") {
	  	    	  message.setContent("Sua senha é <b> "+getSenhaAdm(email) +"</b>","text/html");  
	  	    	  if(getSenhaAdm(email) != null) {
	  	    		Transport.send(message); 
	  	    	  }else {
	  	    		  System.out.println("erro");
	  	    	  }
	  	    	
	  	      }
	  	      if(usr == "aluno") {
	  	    	  message.setContent("Sua senha é <b> "+getSenhaAluno(email) +"</b>","text/html");  
	  	    	  if(getSenhaAluno(email) != null) {
	  	    		Transport.send(message); 
	  	    	  }else {
	  	    		System.out.println("erro"); 
	  	    	  }
	  	    	 
	  	      }
	  	      
	  	      
	  	      
	    	
	      

	     } catch (MessagingException e) {
	        throw new RuntimeException(e);
	    }
	}
	public String getSenhaAluno(String email) {
		//System.out.println(email);
    	String sql = "SELECT senha FROM aluno WHERE email= '"+email+"';";
    	ConnectDb con = new ConnectDb(sql);		
		PreparedStatement ps = con.getPs();
		String senha = null;
		try {
			ResultSet result =	ps.executeQuery();
			result.next();
			senha = result.getString("senha");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return senha;
    	
    }
	public String getSenhaAdm(String email) {
    	String sql = "SELECT senha FROM administrador WHERE email= '"+email+"';";
    	ConnectDb con = new ConnectDb(sql);		
		PreparedStatement ps = con.getPs();
		String senha = null;
		try {
			ResultSet result =	ps.executeQuery();
			result.next();
			senha = result.getString("senha");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return senha;
    	
    }
	
}
