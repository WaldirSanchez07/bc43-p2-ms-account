package com.nttdata.msaccount.application.mapper;

import com.nttdata.msaccount.application.dto.request.PersonRequest;
import com.nttdata.msaccount.domain.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonRequestMapper {

  PersonRequestMapper INSTANCE = Mappers.getMapper(PersonRequestMapper.class);

  default Person map(PersonRequest request) {
    return Person.builder()
            .dni(request.getDni())
            .firstName(request.getFirstName())
            .otherNames(request.getOtherNames())
            .firstSurname(request.getFirstSurname())
            .secondSurname(request.getSecondSurname())
            .build();
  }

}
