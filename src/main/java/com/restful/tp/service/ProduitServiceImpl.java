package com.restful.tp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restful.tp.model.Produit;
import com.restful.tp.repository.ProduitRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProduitServiceImpl implements ProduitService {

    private final ProduitRepository ProduitRepository;

    @Override
    public Produit create(Produit produit) {
        return ProduitRepository.save(produit);
    }

    @Override
    public String delete(Long id) {
        ProduitRepository.deleteById(id);
        return "Produit deleted!";
    }

    @Override
    public List<Produit> list() {
        return ProduitRepository.findAll();
    }

    @Override
    public Produit update(Long id, Produit produit) {
        Produit produitInstance = ProduitRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produit id " + id + " not found !!!"));

        produitInstance.setName(produit.getName());
        produitInstance.setPrice(produit.getPrice());
        produitInstance.setCurrency(produit.getCurrency());
        produitInstance.setTaxe(produit.getTaxe());
        produitInstance.setExpired_at(produit.getExpired_at());
        produitInstance.setProduced_by(produit.getProduced_by  ());
        return ProduitRepository.save(produitInstance   );
    }
}
