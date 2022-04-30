package com.ismo.gstprod.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ismo.gstprod.metier.IMetier;
import com.ismo.gstprod.models.Produit;

@ManagedBean
@Component
public class ProduitBeans {

	@Autowired
	IMetier<Produit> metierProduit;
	
	
	public List<Produit> getAllproduit(){
		return metierProduit.getAll();
	}
}
