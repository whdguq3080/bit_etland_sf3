package com.bit_etland.web.mapper;

import java.util.List;
import org.springframework.stereotype.Component;


@Component
public interface OrderDetailMapper {
	public void insertOrderDetail(OrderDetailMapper ord);
	public List<OrderDetailMapper> selectOrderDetaillist(); 
	public List<OrderDetailMapper> selectOrderDetail(String searchWord);
	public CustomerMapper selectOrderDetails(String searchWord);
	public int countOrderDetail();
	public boolean existsOrderDetail(String searchword);
	public void updateOrderDetail(OrderDetailMapper ord);
	public void deleteOrderDetail(OrderDetailMapper ord);
}
