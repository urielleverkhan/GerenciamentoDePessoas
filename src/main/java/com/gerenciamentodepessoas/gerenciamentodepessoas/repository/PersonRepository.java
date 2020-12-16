package com.gerenciamentodepessoas.gerenciamentodepessoas.repository;

import com.gerenciamentodepessoas.gerenciamentodepessoas.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
