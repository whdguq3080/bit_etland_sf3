package com.bit_etland.web.mapper;

import java.util.List;

public interface OrderDetailDAO {
	public void insertOrderDetail(OrderDetailDAO ord);
	public List<OrderDetailDAO> selectOrderDetaillist(); 
	public List<OrderDetailDAO> selectOrderDetail(String searchWord);
	public CustomerMapper selectOrderDetails(String searchWord);
	public int countOrderDetail();
	public boolean existsOrderDetail(String searchword);
	public void updateOrderDetail(OrderDetailDAO ord);
	public void deleteOrderDetail(OrderDetailDAO ord);
}
