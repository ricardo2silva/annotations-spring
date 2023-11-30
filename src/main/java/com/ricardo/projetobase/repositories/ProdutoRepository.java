package com.ricardo.projetobase.repositories;

import com.ricardo.projetobase.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
