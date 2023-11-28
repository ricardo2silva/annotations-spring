package com.ricardo.projetobase.repositories;

import com.ricardo.projetobase.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
