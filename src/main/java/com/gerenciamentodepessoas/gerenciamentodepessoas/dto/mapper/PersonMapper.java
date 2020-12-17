package com.gerenciamentodepessoas.gerenciamentodepessoas.dto.mapper;

import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.gerenciamentodepessoas.gerenciamentodepessoas.dto.request.PersonDTO;
import com.gerenciamentodepessoas.gerenciamentodepessoas.entity.Person;


@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
