package com.example.project.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "gym")
public class Gym {
    @Id
    private Long gymnumber;
    private String gymname;
    private String gymtrainer;
    private String gymtel;
    private String gymaddr;
    private int addrnum;
    private float x;
    private float y;
    private String areanum;
    private String businessnum;
    private String memberid;
}

