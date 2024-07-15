package com.healthy.repository;

import com.healthy.model.ClientForm;
import com.healthy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientFormRepository extends JpaRepository<ClientForm, Long> {

    List<ClientForm> findByUser(User user);
    List<ClientForm> findByUser_Username(String username);
}
