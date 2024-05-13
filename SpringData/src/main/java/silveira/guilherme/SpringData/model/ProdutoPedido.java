package silveira.guilherme.SpringData.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "ProdutoPedido")
@IdClass(ProdutoPedidoId.class)
public class ProdutoPedido {
	
	@Id
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Produto.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "codProduto", nullable = false)
	private Produto produto;
	
	@Id
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Pedido.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "idPedido", nullable = false)
	private Pedido pedido;
	
	@Column(name = "quantidade", nullable = false)
	private int quantidade;
	
	@Column(name = "valorTotal", nullable = false)
	private double valorTotal;
}
