package Clientes;


import Utilidades.HoraRede;

public class Clientes {
	
	private int id_cliente;
	private String nome_cliente;
	private String documento;
	private String tipoPessoa;
	private String endereco;
	private String telefone;
	private String email;
	private HoraRede dataCadastro;
	
	public Clientes(int id_cliente, String nome_cliente, String documento, String tipoPessoa, String endereco, String telefone, String email, HoraRede dataCadastro) {
		
		this.id_cliente = id_cliente;
		this.nome_cliente = nome_cliente;
		this.documento = documento;
		this.endereco = endereco;
		this.tipoPessoa = tipoPessoa;
		this.telefone = telefone;
		this.email = email;
		
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getCpfCnpj() {
		return documento;
	}

	public void setCpfCnpj(String documento) {
		this.documento = documento;
	}
	
	public String getTipoPessoa() {
		return tipoPessoa;
		
	}
	public void setTipoPessoa() {
		this.tipoPessoa = tipoPessoa;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
