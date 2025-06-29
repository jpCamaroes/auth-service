package com.jpcamaroes.LoginService.repository;

import com.jpcamaroes.LoginService.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    @Override
    Optional<Role> findById(Long aLong);
    Optional<Role> findByNome(String nome);
}