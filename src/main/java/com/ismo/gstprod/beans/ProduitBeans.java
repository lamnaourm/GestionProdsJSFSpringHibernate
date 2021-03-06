package com.ismo.gstprod.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ismo.gstprod.metier.IMetier;
import com.ismo.gstprod.metier.MetierProduit;
import com.ismo.gstprod.models.Produit;

@ManagedBean
@Component
public class ProduitBeans {

	@Autowired
	IMetier<Produit> metierProduit;
	ModeEditProduit mode = ModeEditProduit.ADD;
	
	private Produit newProd=new Produit();

	public Produit getNewProd() {
		return newProd;
	}

	public void setNewProd(Produit newProd) {
		this.newProd = newProd;
	}

	public List<Produit> getAllproduit() {
		return metierProduit.getAll();
	}
	
	public List<String> getAllFamilles(){
		ArrayList<String> familles = new ArrayList<String>();
		familles.add("Electromenager");
		familles.add("Fruit");
		familles.add("Legumes");
		familles.add("Epicerie");
		return familles;
	}

	public void deleteProduit(int id) {
		Produit p = new Produit();
		p.setNumProd(id);
		
		if(metierProduit.delete(p))
			addMessage(FacesMessage.SEVERITY_INFO,"Confirmed", "Produit supprime avec succes");
		else
			addMessage(FacesMessage.SEVERITY_ERROR,"error", "Erreur de suppression");
	}
	
	public void updateProduit(int id) {
		newProd = metierProduit.getOne(id);
		mode = ModeEditProduit.UPDATE;
		PrimeFaces current = PrimeFaces.current();
		current.executeScript("PF('dialog1').show()");
	}
	
	
	public void addUpdateProduit() {
		
		switch (mode) {
		case ADD:
			if(metierProduit.save(newProd)) {
				addMessage(FacesMessage.SEVERITY_INFO,"Confirmed", "Produit ajoute avec succes");
			}else 
				addMessage(FacesMessage.SEVERITY_ERROR,"Confirmed", "Echec d'ajout");
			break;
		case UPDATE:
			if(metierProduit.update(newProd)) {
				addMessage(FacesMessage.SEVERITY_INFO,"Confirmed", "Produit modifie avec succes");
			}else 
				addMessage(FacesMessage.SEVERITY_ERROR,"Confirmed", "Echec de modification");
			mode = ModeEditProduit.ADD;			
			break;

		}
		
	}

	public void addMessage(FacesMessage.Severity severity,String summary, String detail) {
		FacesMessage message = new FacesMessage(severity, summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
}


enum ModeEditProduit{
	ADD,
	UPDATE
}