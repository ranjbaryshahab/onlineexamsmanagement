package ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.personmanagement.adapter.persistence.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "COMMUNICATION")
public class CommunicationJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String phoneNumber;

    private String cellPhoneNumber;

    private String address;

    @OneToOne(mappedBy = "communication")
    private PersonJpaEntity person;
}
