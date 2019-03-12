package com.bit_etland.web.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bit_etland.web.domain.CategoryDTO;
import com.bit_etland.web.proxy.Proxy;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Override
	public void registCategorie(CategoryDTO cat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<?> bringCategorieList(Proxy pagePxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategoryDTO> retrieveCategorie(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoryDTO retrieveCategories(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countCategorie(Proxy pxy) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsCategorie(String searchword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modifyCategorie(CategoryDTO cat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCategorie(CategoryDTO cat) {
		// TODO Auto-generated method stub
		
	}

}
