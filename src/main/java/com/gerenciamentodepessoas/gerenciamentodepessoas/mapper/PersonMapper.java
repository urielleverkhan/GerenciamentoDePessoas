package com.gerenciamentodepessoas.gerenciamentodepessoas.mapper;

import com.gerenciamentodepessoas.gerenciamentodepessoas.dto.request.PersonDTO;
import com.gerenciamentodepessoas.gerenciamentodepessoas.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source ="birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);

    Person toDTO(Person person);
}
