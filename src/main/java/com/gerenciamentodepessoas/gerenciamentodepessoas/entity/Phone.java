package com.gerenciamentodepessoas.gerenciamentodepessoas.entity;

import com.gerenciamentodepessoas.gerenciamentodepessoas.enums.PhoneType;

import javax.persistence.*;



@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;
    @Column(nullable = false)
    private String number;

    public Phone(Long id, PhoneType type, String number) {
        this.id = id;
        this.type = type;
        this.number = number;
    }

    public Phone(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PhoneType getType() {
        return type;
    }

    public void setType(PhoneType type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int soma(int a, int b){
        return a + b;
    }
}
