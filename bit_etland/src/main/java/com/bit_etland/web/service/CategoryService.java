package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.CategoryDTO;
import com.bit_etland.web.proxy.Proxy;
@Component
public interface CategoryService {
	public void registCategorie(CategoryDTO cat);
	public List<?> bringCategorieList(Proxy pagePxy); 
	public List<CategoryDTO> retrieveCategorie(String searchWord);
	public CategoryDTO retrieveCategories(String searchWord);
	public int countCategorie(Proxy pxy);
	public boolean existsCategorie(String searchword);
	public void modifyCategorie(CategoryDTO cat);
	public void removeCategorie(CategoryDTO cat);
}
