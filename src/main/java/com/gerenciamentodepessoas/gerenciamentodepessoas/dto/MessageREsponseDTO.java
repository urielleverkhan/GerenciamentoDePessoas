package com.gerenciamentodepessoas.gerenciamentodepessoas.dto;


import jdk.internal.joptsimple.internal.Messages;
import lombok.Builder;

@Builder
public class MessageREsponseDTO {
   private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageREsponseDTO(String message) {
        this.message = message;
    }

    public MessageREsponseDTO() {

    }

}
