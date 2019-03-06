package com.bit_etland.web.mapper;

import java.util.List;


import com.bit_etland.web.proxy.Proxy;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryMapperImpl implements CategoryMapper {

	@Override
	public void insertCategorie(CategoryMapper cat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<?> selectCategorieList(Proxy pagePxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategoryMapper> selectCategorie(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoryMapper selectCategories(String searchWord) {
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
	public void updateCategorie(CategoryMapper car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategorie(CategoryMapper car) {
		// TODO Auto-generated method stub
		
	}

}
