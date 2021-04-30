package com.bitbox.BITBOX.DAO;

import com.bitbox.BITBOX.models.Items;
import com.bitbox.BITBOX.models.Role;
import com.bitbox.BITBOX.models.RoleEnum;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;
import java.util.Optional;

public interface RoleDAO extends CrudRepository<Role, BigInteger> {
    Optional<Role> findByName(RoleEnum name);
}
