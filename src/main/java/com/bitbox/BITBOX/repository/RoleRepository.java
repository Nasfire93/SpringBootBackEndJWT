package com.bitbox.BITBOX.repository;


import com.bitbox.BITBOX.models.Role;
import com.bitbox.BITBOX.models.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleEnum name);
}
