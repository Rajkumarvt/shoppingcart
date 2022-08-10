package com.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "users")
@Getter
@Setter
public class Users {

    @Id
    long id;
    String name;
    String email;
    String password;
    String created_at;
    String login_token;
    String type;
    String address;
    String is_email_verified;
    String mobile;

}
