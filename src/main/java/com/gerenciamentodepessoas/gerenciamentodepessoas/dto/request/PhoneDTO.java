package com.gerenciamentodepessoas.gerenciamentodepessoas.dto.request;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.*;

import com.gerenciamentodepessoas.gerenciamentodepessoas.enums.PhoneType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PhoneDTO {
    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType Type;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;

}
