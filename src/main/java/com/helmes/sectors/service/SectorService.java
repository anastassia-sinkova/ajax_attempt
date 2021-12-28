package com.helmes.sectors.service;

import com.helmes.sectors.domain.Sector;
import com.helmes.sectors.repository.SectorRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class SectorService {
    private SectorRepository sectorRepository;

    public List<Sector> getAllSectors() { //TODO: return DTO
        log.debug("Getting all sectors");
        List<Sector> result = sectorRepository.findAll();
        //TODO: sort
        return result;
    }
}
