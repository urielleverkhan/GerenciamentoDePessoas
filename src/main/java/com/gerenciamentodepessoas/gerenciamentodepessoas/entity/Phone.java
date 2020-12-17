package com.gerenciamentodepessoas.gerenciamentodepessoas.entity;

import com.gerenciamentodepessoas.gerenciamentodepessoas.enums.PhoneType;
import lombok.*;

import javax.persistence.*;



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
