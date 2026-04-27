package com.turkcell.library_starter.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.turkcell.library_starter.entity.Student;

public interface StudentRepository extends JpaRepository<Student, UUID> {

}