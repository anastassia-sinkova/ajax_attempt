package com.helmes.sectors.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {

    private String username;

//    private Boolean agreement;

//    private List<Sector> sectors;
}
