package com.example.vanekweb.repository;

import com.example.vanekweb.entity.AdminEntity;
import com.example.vanekweb.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, UUID> {

    @Query("from AdminEntity a where a.email =: email ")
    Optional<AdminEntity> findAdminByEmail(@Param("email") String email);
}
