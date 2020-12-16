package com.gerenciamentodepessoas.gerenciamentodepessoas;

import com.gerenciamentodepessoas.gerenciamentodepessoas.entity.Person;
import com.gerenciamentodepessoas.gerenciamentodepessoas.entity.Phone;
import io.micrometer.core.instrument.util.JsonUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class GerenciamentodepessoasApplication {
	Person pessoas = new Person();
    Phone tel = new Phone();

    List lista = new ArrayList<Integer>();

     System.out.println()






	public static void main(String[] args) {
		SpringApplication.run(GerenciamentodepessoasApplication.class, args);
	}

}
