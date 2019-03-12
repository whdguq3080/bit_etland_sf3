package com.bit_etland.web.mapper;

import java.util.List;

import com.bit_etland.web.domain.ProductDTO;
import com.bit_etland.web.proxy.Proxy;
import org.springframework.stereotype.Component;


@Component
public interface ProductMapper {
	public void insertProduct(ProductMapper pro);
	public List<ProductDTO> selectProductlist(Proxy pxy); 
	public List<ProductMapper> selectProduct(String searchWord);
	public ProductMapper selectProducts(String searchWord);
	public int countProduct(Proxy pxy);
	public boolean existsProduct(String searchword);
	public void updateproduct(ProductMapper pro);
	public void deleteproduct(ProductMapper pro);
}
