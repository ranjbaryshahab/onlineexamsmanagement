package ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.service;

import ir.maktab.java32.projects.onlineexamsmanagement.core.enums.AccountStatus;
import ir.maktab.java32.projects.onlineexamsmanagement.core.enums.RoleTypes;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.adapter.persistance.entities.AccountJpaEntity;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.adapter.persistance.repositories.AccountRepository;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.adapter.persistance.repositories.RoleRepository;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.commands.RegisterAccountByGuestCommand;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.exceptions.RegisterAccountByGuestException;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.outcomes.RegisterAccountByGuestOutcome;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.usecases.RegisterAccountByGuestUseCase;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.personmanagement.adapter.persistence.entities.PersonJpaEntity;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.personmanagement.adapter.persistence.repositories.PersonRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RegisterAccountByGuestService implements RegisterAccountByGuestUseCase {
    final AccountRepository accountRepository;
    final RoleRepository roleRepository;
    final PersonRepository personRepository;

    public RegisterAccountByGuestService(AccountRepository accountRepository, RoleRepository roleRepository, PersonRepository personRepository) {
        this.accountRepository = accountRepository;
        this.roleRepository = roleRepository;
        this.personRepository = personRepository;
    }

    @Override
    public RegisterAccountByGuestOutcome register(RegisterAccountByGuestCommand command) throws RegisterAccountByGuestException {
        if (accountRepository.findByUsername(command.getUsername()).isPresent())
            throw new RegisterAccountByGuestException("کاربری با این نام کاربری در سیستم وجود دارد!");
        AccountJpaEntity account = accountRepository.saveAndFlush(
                new AccountJpaEntity(
                        null,
                        command.getUsername(),
                        new BCryptPasswordEncoder().encode(command.getPassword()),
                        AccountStatus.DEACTIVATE,
                        new PersonJpaEntity(),
                        true,
                        Set.of(roleRepository.findRoleJpaEntityByRoleType(RoleTypes.valueOf(command.getRole())),roleRepository.findRoleJpaEntityByRoleType(RoleTypes.ROLE_GUEST))
                ));
        return new RegisterAccountByGuestOutcome(account.getId());
    }
}
