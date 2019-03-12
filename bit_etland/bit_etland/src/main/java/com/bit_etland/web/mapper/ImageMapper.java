package com.bit_etland.web.mapper;

import java.util.List;

import com.bit_etland.web.domain.CustomerDTO;
import com.bit_etland.web.domain.ImageDTO;
import com.bit_etland.web.proxy.Proxy;

import org.springframework.stereotype.Component;


@Component
public interface ImageMapper {
	public void insertImage(ImageDTO img);
	
	public ImageDTO selectImage(CustomerDTO cust);
	public String lastImageSeq();
	public List<ImageDTO> selectImages(Proxy pxy);
	public int countImage(Proxy pxy);
	public boolean existsImage(ImageDTO img);
	public void updateImage(ImageDTO img);
	public void deleteImage(ImageDTO img);
}
