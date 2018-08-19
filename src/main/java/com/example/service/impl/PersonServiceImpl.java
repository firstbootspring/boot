package com.example.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Person;
import com.example.mapper.PersonMapper;
import com.example.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonMapper personMapper;
	@Override
	public Map<String, Object> findMap() {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("sex", "男");
		map.put("age", 12);
		map.put("name", "祝明");
		List<Person> personList = personMapper.queryPerson();
		map.put("list", personList);
		return map;
	}

}
