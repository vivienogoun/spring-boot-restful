package com.restful.tp.service;

import java.util.List;

import com.restful.tp.model.Produit;

public interface ProduitService {

    Produit create(Produit produit );

    List<Produit> list();

    Produit update(Long id, Produit produit);

    String delete(Long id);

}
