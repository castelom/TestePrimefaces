package br.com.bean;

import java.sql.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class RecuperaSenhaView {
	private String senha;
	private Date nasc;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getNasc() {
		return nasc;
	}

	public void setNasc(Date nasc) {
		this.nasc = nasc;
	}
	
}
