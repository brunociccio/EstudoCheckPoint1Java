package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Documentos;
import br.com.fiap.beans.Endereço;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente produtoCliente = new Cliente();
		Documentos produtoDocumentos = new Documentos();
		Endereço produtoEndereço = new Endereço();
		
		produtoCliente.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		produtoCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digete sua idade: ")));
		produtoCliente.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite seu peo: ")));
		produtoCliente.setEndereço(produtoEndereço);
		produtoCliente.setDocumento(produtoDocumentos);
		
		produtoDocumentos.setRg(JOptionPane.showInputDialog("Digite seu RG: "));
		produtoDocumentos.setCpf(JOptionPane.showInputDialog("Digite seu CPF: "));
		produtoDocumentos.setCnh(JOptionPane.showInputDialog("Digite sua CNH: "));
		
		produtoEndereço.setCep(JOptionPane.showInputDialog("Digite seu CEP: "));
		produtoEndereço.setLogradouro(JOptionPane.showInputDialog("Digite seu logradouro: "));
		produtoEndereço.setNúmero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número: ")));
		produtoEndereço.setBairro(JOptionPane.showInputDialog("Digite o Bairro: "));
		produtoEndereço.setCidade(JOptionPane.showInputDialog("Digite a Cidade: "));
		
		System.out.println("Digite seu nome: " + produtoCliente.getNome() + 
				"\nDigite sua idade: " + produtoCliente.getIdade() + 
				"\nDigite seu peso: " + produtoCliente.getPeso() +  
				"\nDigite seu CEP: " + produtoCliente.getEndereço().getCep() +
				"\nDigite seu logradouro: " + produtoCliente.getEndereço().getLogradouro() +
				"\nDigite o número:  " + produtoCliente.getEndereço().getNúmero() +
				"\nDigite o bairro: " + produtoCliente.getEndereço().getBairro() + 
				"\nDigite a cidade: " + produtoCliente.getEndereço().getCidade() +
				"\nDigite seu RG: " + produtoCliente.getDocumento().getRg() + 
				"\nDigite seu CPF: " + produtoCliente.getDocumento().getCpf() + 
				"\nDigite sua CNH: " + produtoCliente.getDocumento().getCnh());
		
				
		
		
		
		
		
		

	}

}
