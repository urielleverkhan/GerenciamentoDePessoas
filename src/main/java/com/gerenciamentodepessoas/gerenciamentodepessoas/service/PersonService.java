package com.gerenciamentodepessoas.gerenciamentodepessoas.service;

import com.gerenciamentodepessoas.gerenciamentodepessoas.dto.MessageResponseDTO;
import com.gerenciamentodepessoas.gerenciamentodepessoas.entity.Person;
import com.gerenciamentodepessoas.gerenciamentodepessoas.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person) {
        Person savedPerson = personRepository.save(person);
        return new MessageResponseDTO("Create person with ID " + savedPerson.getId());

    }
}
