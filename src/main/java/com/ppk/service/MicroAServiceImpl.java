package com.ppk.service;

import org.springframework.stereotype.Service;

import com.codahale.metrics.annotation.ExceptionMetered;
import com.codahale.metrics.annotation.Timed;
import com.ppk.entities.MSData;

@Service
public class MicroAServiceImpl implements MicroAService {

	@Timed
	@ExceptionMetered
	@Override
	public MSData getData() {
		return new MSData("1234", "Title served from Micro A!!", 10);
	}

}
