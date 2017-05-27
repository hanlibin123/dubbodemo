package com.mujourney.service;

import java.util.List;
import java.util.Map;

public interface UserService {

	 public Map<String, Object> findById(int id);  
     
	 public List<Map<String, Object>> queryList();  
}
