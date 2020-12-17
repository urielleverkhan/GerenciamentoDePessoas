package com.gerenciamentodepessoas.gerenciamentodepessoas.utils;

import com.gerenciamentodepessoas.gerenciamentodepessoas.dto.request.PhoneDTO;
import com.gerenciamentodepessoas.gerenciamentodepessoas.entity.Phone;
import com.gerenciamentodepessoas.gerenciamentodepessoas.enums.PhoneType;


public class PhoneUtils {

        private static final String PHONE_NUMBER = "1199999-9999";
        private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
        private static final long PHONE_ID = 1L;

        public static PhoneDTO createFakeDTO() {
            return PhoneDTO.builder()
                    .id(PHONE_ID)
                    .number(PHONE_NUMBER)
                    .Type(PHONE_TYPE)
                    .build();
        }

        public static Phone createFakeEntity() {
            Phone telefone = Phone.builder()
                    .id(PHONE_ID)
                    .number(PHONE_NUMBER)
                    .type(PHONE_TYPE)
                    .build();
            System.out.println(telefone);
            return telefone;
        }

    }