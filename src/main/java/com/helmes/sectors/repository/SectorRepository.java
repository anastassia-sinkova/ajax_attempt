package com.helmes.sectors.repository;

import com.helmes.sectors.domain.Sector;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectorRepository extends JpaRepository<Sector, Long> {
}
