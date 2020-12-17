package com.gerenciamentodepessoas.gerenciamentodepessoas.service;

import com.gerenciamentodepessoas.gerenciamentodepessoas.dto.request.PersonDTO;
import com.gerenciamentodepessoas.gerenciamentodepessoas.dto.response.MessageResponseDTO;
import com.gerenciamentodepessoas.gerenciamentodepessoas.entity.Person;
import com.gerenciamentodepessoas.gerenciamentodepessoas.exeption.PersonNotFoudException;
import com.gerenciamentodepessoas.gerenciamentodepessoas.mapper.PersonMapper;
import com.gerenciamentodepessoas.gerenciamentodepessoas.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {

        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return new MessageResponseDTO("Create person with ID " + savedPerson.getId());

    }


    public List<Person> listAll() {
        List<Person> allPeople = personRepository.findAll();

        return allPeople.stream().map(personMapper::toDTO).collect(Collectors.toList());
    }


    public Person findById(Long id) throws PersonNotFoudException {
        Person person = verifyIfExists(id);

        return personMapper.toDTO(person);
    }

    private Person verifyIfExists(Long id) throws PersonNotFoudException {
        return personRepository.findById(id).orElseThrow(() -> new PersonNotFoudException(id));
    }


    public void delete(Long id) throws PersonNotFoudException{
        Person person = verifyIfExists(id);

        personRepository.deleteById(id);
    }
}
