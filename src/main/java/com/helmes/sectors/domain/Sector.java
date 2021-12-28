package com.helmes.sectors.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Sector {

    @Id
    private int id;

    private String name;

    private Integer parent;
}
