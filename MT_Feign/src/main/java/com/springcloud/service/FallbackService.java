package com.springcloud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FallbackService implements OrderServiceFeign {

	@Override
	public List<String> getMember() {
		List<String> list = new ArrayList<>();
		list.add("fallback");
		return list;
	}

	@Override
	public Object getInfo() {
		return null;
	}

}
