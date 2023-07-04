package com.restful.tp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restful.tp.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
