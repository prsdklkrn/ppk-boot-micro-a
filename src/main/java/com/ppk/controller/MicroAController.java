package com.ppk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codahale.metrics.annotation.ExceptionMetered;
import com.codahale.metrics.annotation.Timed;
import com.ppk.entities.MSData;
import com.ppk.service.MicroAService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(value = "msdata", description = "Exposes endpoints to read MS data", position = 0)
@RestController
@RequestMapping
public class MicroAController {

	private static final String	MS_BASE_METRIC_URL	= "/ms/v1/data";

	private final MicroAService	microAService;

	@Autowired
	public MicroAController(MicroAService microAService) {
		this.microAService = microAService;
	}

	@Timed(name = MS_BASE_METRIC_URL + " == [GET]", absolute = true)
	@ExceptionMetered(name = MS_BASE_METRIC_URL + " == [GET " + ExceptionMetered.DEFAULT_NAME_SUFFIX
			+ "]", absolute = true)
	@ApiOperation(value = "Get micro a data ", notes = "Get micro a data ")
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody MSData welcomeMessage() {
		return microAService.getData();
	}

}
