package ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.adapter.persistance.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

import ir.maktab.java32.projects.onlineexamsmanagement.core.enums.PrivilegeTypes;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "PRIVILEGE")
public class PrivilegeJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PrivilegeTypes privilegeTypes;

    @ManyToMany(mappedBy = "privileges")
    private Set<RoleJpaEntity> roles;
}
