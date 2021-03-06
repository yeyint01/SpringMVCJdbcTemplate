package com.mahar.utilities;

import java.util.List;

public interface IDataAccess<T> {
	public boolean saveOrUpdate();
	public boolean delete();
	public T get();
	public List<T> getList();
}
