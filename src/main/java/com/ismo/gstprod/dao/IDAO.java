package com.ismo.gstprod.dao;

import java.util.List;

public interface IDAO<T> {
	
	List<T> getAll();
	
	T getOne(int numProd);
	
	boolean save(T obj);
	
	boolean update(T obj);
	
	boolean delete(T obj);

}
