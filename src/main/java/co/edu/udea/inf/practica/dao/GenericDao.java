package co.edu.udea.inf.practica.dao;

import java.util.List;


public interface GenericDao<T, ID> {

	public T create(T entity);

	public T update(T entity);

	public T delete(T entity);

	public T findById(ID identifier);

	public List<T> findAll();

}

