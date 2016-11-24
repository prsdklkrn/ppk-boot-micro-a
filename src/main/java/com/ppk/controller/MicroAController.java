package com.ppk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ppk.entities.MSData;
import com.ppk.service.MicroAServiceImpl;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(value = "msdata", description = "Exposes endpoints to read MS data", position = 0)
@RestController
@RequestMapping
public class MicroAController {

	private final MicroAServiceImpl microAService;

	@Autowired
	public MicroAController(MicroAServiceImpl microAService) {
		this.microAService = microAService;
	}

	@ApiOperation(value = "Get micro a data ", notes = "Get micro a data ")
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody MSData welcomeMessage() {
		return microAService.getData();
	}

}
