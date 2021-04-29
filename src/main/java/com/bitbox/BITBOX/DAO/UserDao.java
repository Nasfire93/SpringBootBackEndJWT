package com.bitbox.BITBOX.DAO;

import com.bitbox.BITBOX.models.Users;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;
import java.util.Optional;

public interface UserDao extends CrudRepository<Users, String> {

    //Optional<Users> findByUsername(String username);

    //Boolean existsByUsername(String username);

    //Boolean existsByEmail(String email);
}
