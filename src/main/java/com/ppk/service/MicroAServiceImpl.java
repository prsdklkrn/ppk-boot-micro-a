package com.ppk.service;

import org.springframework.stereotype.Service;

import com.ppk.entities.MSData;

@Service
public class MicroAServiceImpl implements MicroAService {

	@Override
	public MSData getData() {
		return new MSData("1234", "welcome", 10);
	}

}
