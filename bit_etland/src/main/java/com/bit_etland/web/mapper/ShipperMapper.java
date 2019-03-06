package com.bit_etland.web.mapper;

import java.util.List;
import org.springframework.stereotype.Component;


@Component
public interface ShipperMapper {
	public void insertShipper(ShipperMapper cus);
	public List<ShipperMapper> selectShipperlist(); 
	public List<ShipperMapper> selectShipper(String searchWord);
	public ShipperMapper selectShippers(String searchWord);
	public int countShipper();
	public boolean existsShipper(String searchword);
	public void updateShipper(ShipperMapper cus);
	public void deleteShipper(ShipperMapper cus);
}
