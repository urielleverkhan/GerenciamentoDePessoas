package com.gerenciamentodepessoas.gerenciamentodepessoas.entity;

import com.gerenciamentodepessoas.gerenciamentodepessoas.enums.PhoneType;
import lombok.*;

import javax.persistence.*;


//Não consegui fazer o Lombok funcionar, por isto desenvolvi esta api sem o Lombok e por isto esta um pouco diferente do video.
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false)
    private String number;


}
