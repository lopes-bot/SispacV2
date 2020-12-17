package br.com.controllers;

import java.util.Scanner;
import br.com.Models.Administrador;
import br.com.Models.Aluno;
import br.com.buscas.FindAdmin;
import br.com.buscas.FindAluno;
import br.com.criar.Criar_admin;
import br.com.criar.Criar_aluno;

public class MenuInicial {
        static Scanner ler = new Scanner(System.in);
	
	public Administrador loginADM(String login, String senha) {
		/*ler.nextLine();
		System.out.println("Login: ");
		String login = ler.nextLine();
		System.out.println("senha: ");
		String senha = ler.nextLine();
		*/
		FindAdmin adm = new FindAdmin();
		Administrador administrador = adm.Login(login, senha);
		
		return administrador;
	}
	
	public Aluno loginAluno(String login, String senha) {
		/*ler.nextLine();
		System.out.println("Login: ");
		String login = ler.nextLine();
		System.out.println("senha: ");
		String senha = ler.nextLine();
		*/
		FindAluno alu = new FindAluno();
		Aluno aluno = alu.Login(login, senha);
		return aluno;
	}
	
	public void criarADM() {
		System.out.println("Id: ");
		int id = ler.nextInt();
		System.out.println("CNPJ: ");
		String cnpj = ler.nextLine();
		System.out.println("Nome: ");
		String nome = ler.nextLine();
		System.out.println("E-mail: ");
		String email = ler.nextLine();
		System.out.println("senha: ");
		String senha = ler.nextLine();
		Criar_admin ad = new Criar_admin( cnpj, senha, nome, email);
	}
	
	public void criarAluno() {
		System.out.println("Id: ");
		int id = ler.nextInt();
		System.out.println("CPF: ");
		String cpf = ler.nextLine();
		System.out.println("Nome: ");
		String nome = ler.nextLine();
		System.out.println("E-mail: ");
		String email = ler.nextLine();
		System.out.println("senha: ");
		String senha = ler.nextLine();
		Criar_aluno al = new Criar_aluno(cpf, nome, email);
	}
}
