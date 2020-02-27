package ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.personmanagement.adapter.persistence.entities;

import ir.maktab.java32.projects.onlineexamsmanagement.core.enums.DegreeOfEducation;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.adapter.persistance.entities.AccountJpaEntity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "PERSON_TYPE" ,discriminatorType = DiscriminatorType.STRING)
@Table(name = "PERSON")
public class PersonJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String fathersName;

    private String nationalCode;

    @Temporal(TemporalType.DATE)
    private Date birthOfDate;

    @Enumerated(EnumType.STRING)
    private DegreeOfEducation degreeOfEducation;

    @OneToOne(mappedBy = "person")
    private AccountJpaEntity account;

    @OneToOne
    private CommunicationJpaEntity communication;
}
