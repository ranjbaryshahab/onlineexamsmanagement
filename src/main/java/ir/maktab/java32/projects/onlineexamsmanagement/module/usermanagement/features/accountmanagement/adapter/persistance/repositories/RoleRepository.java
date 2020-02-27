package ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.adapter.persistance.repositories;

import ir.maktab.java32.projects.onlineexamsmanagement.core.enums.RoleTypes;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.adapter.persistance.entities.RoleJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<RoleJpaEntity, Long> {
    RoleJpaEntity findRoleJpaEntityByRoleType(RoleTypes roleType);
}
