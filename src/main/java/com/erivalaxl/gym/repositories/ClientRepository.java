package com.erivalaxl.gym.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.erivalaxl.gym.entities.ClientEntitie;

import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntitie, String> {
    public Optional<ClientEntitie> findByIdentity(String ID);
 }
