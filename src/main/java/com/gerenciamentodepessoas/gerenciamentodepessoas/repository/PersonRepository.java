package com.gerenciamentodepessoas.gerenciamentodepessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciamentodepessoas.gerenciamentodepessoas.entity.Person;


public interface PersonRepository extends JpaRepository<Person, Long> {


}
