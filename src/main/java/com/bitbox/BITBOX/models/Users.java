package com.bitbox.BITBOX.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "USER")
public class Users {
    @Id
    @NonNull
    private String dni;


    private String name;
    //@NonNull
    //private String surname;
    @NonNull
    private String email;
    //@NonNull
    //private LocalDate dateup;
    @NonNull
    private String password;

    @ManyToMany
    @JoinTable(	name = "USER_ROLES",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "roleId"))
    private Set<Role> roles = new HashSet<>();


}
