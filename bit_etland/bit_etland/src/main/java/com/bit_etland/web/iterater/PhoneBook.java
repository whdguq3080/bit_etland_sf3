package com.bit_etland.web.iterater;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bit_etland.web.domain.CustomerDTO;

import lombok.Data;

@Data
public class PhoneBook {
	public static void main(String[] args) {
		HashMap<String, Object> map = null;
	Set set = map.entrySet();
	Iterator it = set.iterator();
	while(it.hasNext()) {
		Map.Entry ent = (Entry) it.next();
		String id = (String) ent.getKey();
		CustomerDTO cust = (CustomerDTO) ent.getValue();
	}
	}
}
