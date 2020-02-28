package ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.adapter.persistance.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

import ir.maktab.java32.projects.onlineexamsmanagement.core.enums.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "ROLE")
public class RoleJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private RoleTypes roleType;

    @ManyToMany(mappedBy = "roles")
    private Collection<AccountJpaEntity> accounts;

    @ManyToMany
    @JoinTable(
            name = "roles_privileges",
            joinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "privilege_id", referencedColumnName = "id"))
    private Set<PrivilegeJpaEntity> privileges;
}
