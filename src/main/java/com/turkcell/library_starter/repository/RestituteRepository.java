package com.turkcell.library_starter.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.turkcell.library_starter.entity.Restitute;

public interface RestituteRepository extends JpaRepository<Restitute, UUID> {

}