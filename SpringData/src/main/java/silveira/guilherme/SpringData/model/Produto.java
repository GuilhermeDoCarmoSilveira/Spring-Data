package silveira.guilherme.SpringData.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Produto")
public class Produto {
	
	@Id
	@Column(name = "codProduto", nullable = false)
	private int codProduto;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "valorUnitario", nullable = false)
	private double valorUnitario;

}
