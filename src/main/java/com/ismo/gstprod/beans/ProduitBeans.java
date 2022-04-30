package com.ismo.gstprod.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ismo.gstprod.metier.IMetier;
import com.ismo.gstprod.models.Produit;

@ManagedBean
@Component
public class ProduitBeans {

	@Autowired
	IMetier<Produit> metierProduit;

	public List<Produit> getAllproduit() {
		return metierProduit.getAll();
	}

	public void deleteProduit(int id) {
		Produit p = new Produit();
		p.setNumProd(id);
		
		if(metierProduit.delete(p))
			addMessage(FacesMessage.SEVERITY_INFO,"Confirmed", "Produit supprime avec succes");
		else
			addMessage(FacesMessage.SEVERITY_ERROR,"error", "Erreur de suppression");
	}

	public void addMessage(FacesMessage.Severity severity,String summary, String detail) {
		FacesMessage message = new FacesMessage(severity, summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
}
