package com.bit_etland.web.domain;

import lombok.Data;

@Data
public  class ProductDTO {
	private String productsID,
					rnum,
					productName,
					supplierID,
					categoryID,
					unit,
					price;

}
