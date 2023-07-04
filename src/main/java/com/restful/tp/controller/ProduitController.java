package com.restful.tp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restful.tp.model.Produit;
import com.restful.tp.service.ProduitService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/Produit")
@AllArgsConstructor
public class ProduitController {

    private final ProduitService ProduitService;

    @PostMapping("/create")
    public Produit create(@RequestBody Produit produit) {
        return ProduitService.create(produit);
    }

    @GetMapping("/list")
    public List<Produit> list() {
        return ProduitService.list();
    }

    @PutMapping("/update/{id}")
    public Produit update(@PathVariable Long id, @RequestBody Produit produit) {
        return ProduitService.update(id, produit);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return ProduitService.delete(id);
    }

}