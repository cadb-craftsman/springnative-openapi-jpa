package org.craftsman.restservice.domain.mappers;

import org.mapstruct.Mapper;

import org.craftsman.restservice.domain.dto.RestServiceDto;
import org.craftsman.restservice.domain.model.RestServiceEntity;

@Mapper
public interface RestServiceFactoryMapper {
	
	RestServiceEntity mapRestServiceDtoToRestServiceEntity(RestServiceDto d);
	
	RestServiceDto mapRestServiceEntityToRestServiceDto(RestServiceEntity e);

}
