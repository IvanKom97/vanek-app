package com.example.vanekweb.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class UserDTO {
    private String first_name;
    private String second_name;
    private String email;
    private String password;

}
