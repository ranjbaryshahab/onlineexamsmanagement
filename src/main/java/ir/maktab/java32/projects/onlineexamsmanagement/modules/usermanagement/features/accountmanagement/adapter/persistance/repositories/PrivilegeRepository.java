package ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.adapter.persistance.repositories;

import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.adapter.persistance.entities.PrivilegeJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivilegeRepository extends JpaRepository<PrivilegeJpaEntity, Long> {
}
