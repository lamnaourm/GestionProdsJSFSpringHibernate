package com.ismo.gstprod.metier;

import java.util.List;

public interface IMetier<T> {

	List<T> getAll();
	
	T getOne(int numProd);
	
	boolean save(T obj);
	
	boolean update(T obj);
	
	boolean delete(T obj);

}
