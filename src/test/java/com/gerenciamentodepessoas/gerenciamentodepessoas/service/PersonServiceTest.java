package com.gerenciamentodepessoas.gerenciamentodepessoas.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.gerenciamentodepessoas.gerenciamentodepessoas.dto.request.PersonDTO;
import com.gerenciamentodepessoas.gerenciamentodepessoas.dto.response.MessageResponseDTO;
import com.gerenciamentodepessoas.gerenciamentodepessoas.entity.Person;
import com.gerenciamentodepessoas.gerenciamentodepessoas.dto.mapper.PersonMapper;
import com.gerenciamentodepessoas.gerenciamentodepessoas.repository.PersonRepository;
import com.gerenciamentodepessoas.gerenciamentodepessoas.utils.PersonUtils;




@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @Mock
    private PersonMapper personMapper;

    @InjectMocks
    private PersonService personService;

    @Test
    void testGivenPersonDTOThenReturnSuccessSavedMessage() {
        PersonDTO personDTO = new PersonUtils().createFakeDTO();
        Person expectedSavedPerson = new PersonUtils().createFakeEntity();

        when(personMapper.toModel(personDTO)).thenReturn(expectedSavedPerson);
        when(personRepository.save(any(Person.class))).thenReturn(expectedSavedPerson);

        MessageResponseDTO expectedSuccessMessage = createExpectedSuccessMessage(expectedSavedPerson.getId());
        MessageResponseDTO successMessage = personService.create(personDTO);

        assertEquals(expectedSuccessMessage, successMessage);
    }

    private MessageResponseDTO createExpectedSuccessMessage(Long savedPersonId) {
        return MessageResponseDTO.builder()
                .message("Person successfully created with ID " + savedPersonId)
                .build();
    }

}

