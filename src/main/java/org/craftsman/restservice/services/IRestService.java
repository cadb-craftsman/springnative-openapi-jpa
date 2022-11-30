package org.craftsman.restservice.services;

import org.craftsman.restservice.domain.dto.RestServiceDto;
import org.craftsman.restservice.domain.dto.RestServiceDtoList;
import org.craftsman.restservice.domain.exceptions.RestServiceException;

public interface IRestService {

	public RestServiceDto create(RestServiceDto in) throws RestServiceException;

	public RestServiceDtoList read() throws RestServiceException;
	
	public RestServiceDto read(Long id) throws RestServiceException;

	public RestServiceDto update(RestServiceDto in) throws RestServiceException;

	public RestServiceDto delete(RestServiceDto in) throws RestServiceException;

}
