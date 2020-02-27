package ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.outcomes;

import ir.maktab.java32.projects.onlineexamsmanagement.core.anotatitons.UseCaseOutcome;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.domain.UserRole;
import lombok.Value;

import java.util.Set;

@Value

@UseCaseOutcome
public class LoginToAccountByUserOutcome {
    String username;
    Set<UserRole> roles;
}
