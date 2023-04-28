package com.Geekster.UniversityEventManager.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;

    @NotBlank
    @Size(min = 2, max = 50)
    @Column
    private String name;

    @NotBlank
    @Size(min = 2, max = 50)
    @Column
    private String location;

    @NotNull
    @Column
    private LocalDate date;

    @NotNull
    @Column
    private LocalTime startTime;

    @NotNull
    @Column
    private LocalTime endTime;
}
