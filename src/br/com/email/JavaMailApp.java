package br.com.email;

import br.com.buscas.*;

import java.util.ArrayList;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class JavaMailApp {
        private String emailDestino = "";
	private String texto;
	private String assunto;
	private int id_evento;
	
	
  public JavaMailApp(int id_evento) {
    Properties props = new Properties();
    this.id_evento = id_evento;
    setAssunto();
    setTexto();
    setEmailDestino();
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
                 .parse(getEmailDestino() + "teste@hotmail.com");

      message.setRecipients(Message.RecipientType.TO, toUser);
      message.setSubject(getAssunto());//Assunto
      message.setContent(getTexto(),"text/html");
      
      /**M�todo para enviar a mensagem criada*/
      Transport.send(message);

     } catch (MessagingException e) {
        throw new RuntimeException(e);
    }
  }
  
  
public int getId_evento() {
	return id_evento;
}


public void setId_evento(int id_evento) {
	this.id_evento = id_evento;
}

public String getEmailDestino() {
	return emailDestino;
}
public void setEmailDestino() {
	FindAluno alu = new FindAluno();
	ArrayList<String> list = new ArrayList<String>();
	list = alu.findAllEmails();
	for (String lista: list) {
            this.emailDestino += lista + " , ";
	}
}
public String getTexto() {
	return texto;
}
public void setTexto() {
	FindEvento e = new FindEvento();
	String nome = e.findOne(getId_evento()).getNomeEvento();
	String dataI = e.findOne(getId_evento()).getDataAbertura();
	String dataE = e.findOne(getId_evento()).getDataEncerra();
	String horaI = e.findOne(getId_evento()).getHoraInicio();
	String horaE = e.findOne(getId_evento()).getHoraFim();
	String ende = e.findOne(getId_evento()).getEndereco();
	
	String text = "<h3> " + nome + "</h3> <br/> <p> Data de abertura é " + dataI +  " e o horário de abertura do evento será as " + horaI + " hora(s). A data de encerramento é "
			+ dataE + " e o horário de encerramento do evento será as " + horaE +  " hora(s). O endereço do evento é " + ende +"</p>";
	this.texto = text;
}
public String getAssunto() {
	return assunto;
}
public void setAssunto() {
	FindEvento e = new FindEvento();
	this.assunto = e.findOne(getId_evento()).getNomeEvento();
}
}
