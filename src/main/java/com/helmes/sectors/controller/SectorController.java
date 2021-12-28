package com.helmes.sectors.controller;

import com.helmes.sectors.domain.Sector;
import com.helmes.sectors.service.SectorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class SectorController {

    private SectorService sectorService;

    @GetMapping("/sectors")
    public List<Sector> getSectors() {
        return sectorService.getAllSectors();
    }
}

