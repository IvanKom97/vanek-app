package com.example.vanekweb.dto.mappers;

import com.example.vanekweb.dto.UserDTO;
import com.example.vanekweb.entity.UserEntity;

public interface UserMapperToEntity {
    static UserEntity toUserEntity(UserDTO userDTO) {
        return new UserEntity(userDTO);
    }
}
