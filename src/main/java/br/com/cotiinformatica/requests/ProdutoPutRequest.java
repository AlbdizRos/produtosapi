package br.com.cotiinformatica.requests;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProdutoPutRequest {

	private Integer idProduto;
	private String nome;
	private String descricao;
	private Double preco;
	private Integer quantidade;
	private Integer idFornecedor;
}



