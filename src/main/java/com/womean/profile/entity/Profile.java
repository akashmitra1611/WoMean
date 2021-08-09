package com.womean.profile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profile {

    String id;
    String firstName;
    String lastName;
    String dateOfBirth;
    String gender;

}
