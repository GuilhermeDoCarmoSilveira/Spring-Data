package silveira.guilherme.SpringData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import silveira.guilherme.SpringData.model.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Integer> {
	
}
