package ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.personmanagement.adapter.persistence.repositories;

import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.personmanagement.adapter.persistence.entities.PersonJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonJpaEntity, Long> {
}
