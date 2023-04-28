package com.Geekster.UniversityEventManager.Model;

import com.Geekster.UniversityEventManager.Model.Enum.Department;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;

    @NotBlank
    @Size(min = 2, max = 30)
    @Pattern(regexp = "^[A-Z][a-z]*$", message = "First name should start with a capital letter")
    @Column
    private String firstName;

    @NotBlank
    @Size(min = 2, max = 30)
    @Column
    private String lastName;

    @Min(value = 18, message = "Age should be greater than or equal to 18")
    @Max(value = 25, message = "Age should be less than or equal to 25")
    @Column
    private Integer age;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column
    private Department department;
}
