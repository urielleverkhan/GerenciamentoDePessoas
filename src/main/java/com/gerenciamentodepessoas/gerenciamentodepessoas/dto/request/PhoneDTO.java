package com.gerenciamentodepessoas.gerenciamentodepessoas.dto.request;

import com.gerenciamentodepessoas.gerenciamentodepessoas.enums.PhoneType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PhoneDTO {
    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType Type;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;

    public PhoneDTO(Long id, PhoneType type, String number) {
        this.id = id;
        Type = type;
        this.number = number;
    }

    public PhoneDTO(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PhoneType getType() {
        return Type;
    }

    public void setType(PhoneType type) {
        Type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
