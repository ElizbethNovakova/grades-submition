package com.ynovakova.gradessubmition.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NonNull
    @Column(name = "subject", nullable = false)
    @NotBlank(message = "Subject cannot be blank")
    private String subject;

    @NonNull
    @Column(name = "code", nullable = false, unique = true)
    @NotBlank(message = "Course code cannot be blank")
    private String code;

    @NonNull
    @Column(name = "description", nullable = false)
    @NotBlank(message = "Description cannot be blank")
    private String description;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Grade> grades;
}
