package com.bitbox.BITBOX.DAO;

import com.bitbox.BITBOX.models.Users;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;
import java.util.Optional;

public interface UserDAO extends CrudRepository<Users, String> {

    Optional<Users> findByName(String username);

    Boolean existsByName(String username);

    Boolean existsByEmail(String email);
}
