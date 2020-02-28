package ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.service;

import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.adapter.persistance.entities.AccountJpaEntity;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.adapter.persistance.mappers.RoleMapper;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.adapter.persistance.repositories.AccountRepository;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.adapter.persistance.repositories.RoleRepository;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.commands.LoginToAccountByUserCommand;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.exceptions.LoginToAccountByUserException;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.outcomes.LoginToAccountByUserOutcome;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.usecases.LoginToAccountByUserUseCase;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.personmanagement.adapter.persistence.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LoginToAccountByUserService implements LoginToAccountByUserUseCase {
    final AccountRepository accountRepository;
    final RoleRepository roleRepository;
    final PersonRepository personRepository;

    public LoginToAccountByUserService(AccountRepository accountRepository, RoleRepository roleRepository, PersonRepository personRepository) {
        this.accountRepository = accountRepository;
        this.roleRepository = roleRepository;
        this.personRepository = personRepository;
    }

    @Override
    public LoginToAccountByUserOutcome login(LoginToAccountByUserCommand command) throws LoginToAccountByUserException {
        Optional<AccountJpaEntity> account = accountRepository.findByUsername(command.getUsername());
        if (account.isEmpty())
            throw new LoginToAccountByUserException("اطلاعات وارد شده صحبح نمی باشد");

        return new LoginToAccountByUserOutcome(account.get().getUsername()
                ,account
                .stream()
                .flatMap(accountJpaEntity -> accountJpaEntity.getRoles().stream())
                .map(RoleMapper::map)
                .collect(Collectors.toSet()));
    }
}
