package com.bit_etland.web.mapper;

import java.util.List;

import com.bit_etland.web.proxy.Proxy;


public interface CategoryMapper {
	public void insertCategorie(CategoryMapper cat);
	public List<?> selectCategorieList(Proxy pagePxy); 
	public List<CategoryMapper> selectCategorie(String searchWord);
	public CategoryMapper selectCategories(String searchWord);
	public int countCategorie(Proxy pxy);
	public boolean existsCategorie(String searchword);
	public void updateCategorie(CategoryMapper car);
	public void deleteCategorie(CategoryMapper car);
}
