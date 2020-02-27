package ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.adapter.persistance.mappers;

import ir.maktab.java32.projects.onlineexamsmanagement.core.anotatitons.Mapper;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.adapter.persistance.entities.RoleJpaEntity;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.domain.UserRole;

@Mapper
public class RoleMapper {
    public static UserRole map(RoleJpaEntity role) {
        return new UserRole(
                role.getRoleType().toString()
        );
    }
}
