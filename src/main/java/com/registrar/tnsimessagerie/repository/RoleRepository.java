package com.registrar.tnsimessagerie.repository;

import com.registrar.tnsimessagerie.model.Role;
import com.registrar.tnsimessagerie.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
