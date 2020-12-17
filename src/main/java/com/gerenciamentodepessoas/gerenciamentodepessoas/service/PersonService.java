package com.gerenciamentodepessoas.gerenciamentodepessoas.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.PersistenceException;
import java.util.stream.Collectors;
import java.util.List;
import lombok.AllArgsConstructor;

import com.gerenciamentodepessoas.gerenciamentodepessoas.dto.request.PersonDTO;
import com.gerenciamentodepessoas.gerenciamentodepessoas.dto.response.MessageResponseDTO;
import com.gerenciamentodepessoas.gerenciamentodepessoas.entity.Person;
import com.gerenciamentodepessoas.gerenciamentodepessoas.exeption.PersonNotFoudException;
import com.gerenciamentodepessoas.gerenciamentodepessoas.dto.mapper.PersonMapper;
import com.gerenciamentodepessoas.gerenciamentodepessoas.repository.PersonRepository;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {

    private final PersonRepository personRepository;

    private final PersonMapper personMapper;

    public MessageResponseDTO create(PersonDTO personDTO) {
        Person person = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(person);

        MessageResponseDTO messageResponse = createMessageResponse("Person successfully created with ID ", savedPerson.getId());

        return messageResponse;
    }

    public PersonDTO findById(Long id) throws PersonNotFoudException {
        Person person = personRepository.findById(id)
                .orElseThrow(() -> new PersistenceException(String.valueOf(id)));

        return personMapper.toDTO(person);
    }

    public List<PersonDTO> listAll() {
        List<Person> people = personRepository.findAll();
        return people.stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }

    public MessageResponseDTO update(Long id, PersonDTO personDTO) throws PersonNotFoudException {
        personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoudException(id));

        Person updatedPerson = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(updatedPerson);

        MessageResponseDTO messageResponse = createMessageResponse("Person successfully updated with ID ", savedPerson.getId());

        return messageResponse;
    }

    public void delete(Long id) throws PersonNotFoudException {
        personRepository.findById(id)
                .orElseThrow(() -> new PersistenceException(String.valueOf(id)));

        personRepository.deleteById(id);
    }

    private MessageResponseDTO createMessageResponse(String s, Long id2) {
        return MessageResponseDTO.builder()
                .message(s + id2)
                .build();
    }
}

