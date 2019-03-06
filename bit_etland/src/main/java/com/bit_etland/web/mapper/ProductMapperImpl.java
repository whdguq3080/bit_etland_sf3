package com.bit_etland.web.mapper;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit_etland.web.domain.ProductDTO;
import com.bit_etland.web.proxy.Proxy;

@Repository
public class ProductMapperImpl implements ProductMapper{

	@Override
	public void insertProduct(ProductMapper pro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductDTO> selectProductlist(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductMapper> selectProduct(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductMapper selectProducts(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countProduct(Proxy pxy) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsProduct(String searchword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateproduct(ProductMapper pro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteproduct(ProductMapper pro) {
		// TODO Auto-generated method stub
		
	}

}
