package silveira.guilherme.SpringData.model;

import java.time.LocalDate;

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
@Table(name = "Pedido")
public class Pedido {
	
	@Id
	@Column(name = "idPedido", nullable = false)
	private int idPedido;
	
	@Column(name = "dataPedido", nullable = false)
	private LocalDate dataPedido;
}
