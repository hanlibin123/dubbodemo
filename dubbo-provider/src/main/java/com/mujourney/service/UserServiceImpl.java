package com.mujourney.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version="1.0.0")
public class UserServiceImpl implements UserService {

	public Map<String, Object> findById(int id) {
		return get(id);
	}

	public List<Map<String, Object>> queryList() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for (int i = 1; i <= 10; i++) {
			list.add(get(i));
		}
		return list;
	}

	private Map<String, Object> get(int id) {
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("id", id);
		res.put("name", "1");
		res.put("type", "1");
		res.put("date", "1");
		return res;
	}

}
