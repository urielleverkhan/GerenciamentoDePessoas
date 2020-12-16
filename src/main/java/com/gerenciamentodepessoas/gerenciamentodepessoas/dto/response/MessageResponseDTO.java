package com.gerenciamentodepessoas.gerenciamentodepessoas.dto.response;



import lombok.Builder;

@Builder
public class MessageResponseDTO {
   private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageResponseDTO(String message) {
        this.message = message;
    }

    public MessageResponseDTO() {

    }

}
