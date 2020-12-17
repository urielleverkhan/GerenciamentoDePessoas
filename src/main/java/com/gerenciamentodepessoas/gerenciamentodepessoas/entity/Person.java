package com.gerenciamentodepessoas.gerenciamentodepessoas.entity;

import com.gerenciamentodepessoas.gerenciamentodepessoas.dto.request.PhoneDTO;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


//Não consegui fazer o Lombok funcionar, por isto desenvolvi esta api sem o Lombok e por isto esta um pouco diferente do video.
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String cpf;

    private LocalDate birthDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Phone> phones;


}
