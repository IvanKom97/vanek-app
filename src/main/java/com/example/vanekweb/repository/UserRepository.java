package com.example.vanekweb.repository;

import com.example.vanekweb.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {

    @Query("from UserEntity u where u.email =: email ")
    Optional<UserEntity> findUserByEmail(@Param("email") String email);
}
