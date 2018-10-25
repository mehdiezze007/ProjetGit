package com.example.demo.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.IProduitRepository;
import com.example.demo.entities.Produit;

@RestController
public class CataloqueController {
 @Autowired
 private IProduitRepository produitRepository;
 
 @RequestMapping("/save")
 public Produit saveProduit(Produit p) {
	 produitRepository.save(p);
	 return p;
 }
 @RequestMapping("/all")
 public List<Produit> getProduits(){
	 return produitRepository.findAll();
 }
}
