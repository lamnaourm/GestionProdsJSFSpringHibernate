package com.ismo.gstprod.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ismo.gstprod.models.Produit;


@Repository
@Transactional
@EnableTransactionManagement
public class DaoProduit implements IDAO<Produit> {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Produit> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Produit").list();
	}

	@Override
	public Produit getOne(int numProd) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Produit.class, numProd);
	}

	@Override
	public boolean save(Produit obj) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(obj);
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean update(Produit obj) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(obj);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean delete(Produit obj) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(obj);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

}
