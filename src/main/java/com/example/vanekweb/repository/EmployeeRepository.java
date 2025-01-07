package com.example.vanekweb.repository;

import com.example.vanekweb.entity.EmployeeEntity;
import com.example.vanekweb.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, UUID> {

    @Query("from EmployeeEntity e where e.email =: email ")
    Optional<EmployeeEntity> findEmployeeByEmail(@Param("email") String email);
}
