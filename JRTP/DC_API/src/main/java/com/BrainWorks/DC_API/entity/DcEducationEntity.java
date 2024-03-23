package com.BrainWorks.DC_API.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "DC_Education")
public class DcEducationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer EducationId;
    private Long caseNum;
    private String highestQualification;
    private String universityName;
    private Integer graduationYear;
}
