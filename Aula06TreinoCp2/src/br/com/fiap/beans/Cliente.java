package br.com.fiap.beans;

public class Cliente {

	// visibilidade, tipo de dado e nome da variável
	private String nome;
	private int idade;
	private double peso;
	private Endereço endereço;
	private Documentos documento;
	// setters and getters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Endereço getEndereço() {
		return endereço;
	}
	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}
	public Documentos getDocumento() {
		return documento;
	}
	public void setDocumento(Documentos documento) {
		this.documento = documento;
	}
}
