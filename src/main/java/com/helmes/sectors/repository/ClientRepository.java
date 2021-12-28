package com.helmes.sectors.repository;

import com.helmes.sectors.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
