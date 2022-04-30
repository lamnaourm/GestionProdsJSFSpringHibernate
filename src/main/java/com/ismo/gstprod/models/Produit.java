package com.ismo.gstprod.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numProd;
	
	@Column
	private String description;
	
	@Column
	private String famille;
	
	@Column(name="prixAchat")
	private double prix_achat;
	
	@Column(name="prixVente")
	private double prix_vente;

	public Produit() {

	}

	public Produit(int numProd, String description, String famille, double prix_achat, double prix_vente) {
		super();
		this.numProd = numProd;
		this.description = description;
		this.famille = famille;
		this.prix_achat = prix_achat;
		this.prix_vente = prix_vente;
	}

	public int getNumProd() {
		return numProd;
	}

	public void setNumProd(int numProd) {
		this.numProd = numProd;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFamille() {
		return famille;
	}

	public void setFamille(String famille) {
		this.famille = famille;
	}

	public double getPrix_achat() {
		return prix_achat;
	}

	public void setPrix_achat(double prix_achat) {
		this.prix_achat = prix_achat;
	}

	public double getPrix_vente() {
		return prix_vente;
	}

	public void setPrix_vente(double prix_vente) {
		this.prix_vente = prix_vente;
	}

}
