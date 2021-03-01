package com.phonebook.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phonebook.eniity.ContactEntity;

@Repository
public interface ContactJpaRepo extends JpaRepository<ContactEntity, Serializable>{

}
