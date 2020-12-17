package com.gerenciamentodepessoas.gerenciamentodepessoas.dto.request;

import org.hibernate.validator.constraints.br.CPF;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonDTO {
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String lastName;

    @NotEmpty
    @CPF
    private String cpf;


    private String birthDate;

    @Valid
    @NotEmpty
    private List<PhoneDTO> phones;


}
