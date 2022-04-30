package com.ismo.gstprod.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ismo.gstprod.dao.DaoProduit;
import com.ismo.gstprod.dao.IDAO;
import com.ismo.gstprod.models.Produit;

@Service
public class MetierProduit implements IMetier<Produit> {

	@Autowired
	IDAO<Produit> daoProduit;
	
	@Override
	public List<Produit> getAll() {
		// TODO Auto-generated method stub
		return daoProduit.getAll();
	}

	@Override
	public Produit getOne(int numProd) {
		// TODO Auto-generated method stub
		return daoProduit.getOne(numProd);
	}

	@Override
	public boolean save(Produit obj) {
		// TODO Auto-generated method stub
		return daoProduit.save(obj);
	}

	@Override
	public boolean update(Produit obj) {
		// TODO Auto-generated method stub
		return daoProduit.update(obj);
	}

	@Override
	public boolean delete(Produit obj) {
		// TODO Auto-generated method stub
		return daoProduit.delete(obj);
	}

}
