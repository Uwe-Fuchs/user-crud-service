package com.uwefuchs.demo.usercrud.server.domain;

public class User {
	
    private final Long id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String username;
    private final String password;

    User(UserBuilder builder) {
        this.id = builder.getId();
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.email = builder.getEmail();
        this.username = builder.getUsername();
        this.password = builder.getPassword();
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }    
}
