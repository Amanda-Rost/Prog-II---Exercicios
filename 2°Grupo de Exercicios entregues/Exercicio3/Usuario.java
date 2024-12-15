package Exercicio3;

import java.util.ArrayList;
import java.util.Objects;

public class Usuario {
	private String login;
	private String nome;
	private ArrayList<Postagem> postagens;

	public Usuario(String nome, String login) {
		this.login = login;
		this.nome = nome;
		this.postagens = new ArrayList();
	}

	public String getLogin() {
		return this.login;
	}

	public String getNome() {
		return this.nome;
	}

	public void setLogin(String novoLogin) {
		this.login = novoLogin;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	public void posta(String conteudo) {
		Objects.requireNonNull(conteudo, "conteudo n�o pode ser nulo !!!");
		Postagem p = new Postagem(conteudo);
		this.postagens.add(p);
	}

	public Postagem getPost(int pos) {
		return this.postagens.get(pos);
	}

	public boolean apaga(Postagem p) {
		return this.postagens.remove(p);
	}

	public int getTotalPosts() {
		return this.postagens.size();
	}

	public Postagem buscaPost(String valor) {
		int cont = 0;
		Postagem p;
		do {
			p = this.postagens.get(cont);
			cont++;
			if (p.getConteudo().contains(valor)) {
				return p;
			} else
				return null;
		} while (cont < this.postagens.size());
	}

	@Override
	public String toString() {
		String resp = "\nPostagens: ";
		int cont = 0;
		do {
			resp = resp + "\n" + this.postagens.get(cont).getConteudo();
			cont++;
		} while (cont < this.postagens.size());
		return "Nome: " + this.nome + "\nLogin: " + this.login + "\nNumero de postagem: " + this.getTotalPosts() + resp;
	}
	public boolean equals(Object o) {
		if(o == null) return false;
		else if(o instanceof Usuario) {
			Usuario usu= (Usuario) o;
			int cont = 0, dif = 0;
			boolean resp;
			do {
				resp = this.postagens.get(cont).equals(usu.postagens.get(cont)) ;
				if(resp == false)dif++;
			
			}while(cont < this.postagens.size());
			if(dif > 0) resp = false;
			
			return this.login.equals(usu.login) && this.nome.equals(usu.nome) && resp;
		}
		else return false;
	}
}
