package ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.adapter.persistance.entities;

import ir.maktab.java32.projects.onlineexamsmanagement.core.enums.AccountStatus;
import lombok.*;

import javax.persistence.*;

import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.personmanagement.adapter.persistence.entities.PersonJpaEntity;

import java.util.Collection;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "ACCOUNT")
public class AccountJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;

    @ToString.Exclude
    @OneToOne(cascade = CascadeType.ALL)
    private PersonJpaEntity person;

    private boolean active;

    @ToString.Exclude
    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    @Column(nullable = false)
    private Set<RoleJpaEntity> roles;
}
