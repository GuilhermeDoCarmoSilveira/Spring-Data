package silveira.guilherme.SpringData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import silveira.guilherme.SpringData.model.Pedido;

public interface IPedidoRepository extends JpaRepository<Pedido, Integer> {

}
