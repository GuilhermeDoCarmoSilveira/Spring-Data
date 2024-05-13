package silveira.guilherme.SpringData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import silveira.guilherme.SpringData.model.ProdutoPedido;
import silveira.guilherme.SpringData.model.ProdutoPedidoId;

public interface IProdutoPedidoRepository extends JpaRepository<ProdutoPedido, ProdutoPedidoId> {

}
