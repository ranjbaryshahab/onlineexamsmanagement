package ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.usecases;

import ir.maktab.java32.projects.onlineexamsmanagement.core.anotatitons.UseCase;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.commands.RegisterAccountByGuestCommand;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.exceptions.RegisterAccountByGuestException;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.outcomes.RegisterAccountByGuestOutcome;
import org.springframework.security.access.annotation.Secured;

@UseCase
@Secured("ROLE_GUEST")
public interface RegisterAccountByGuestUseCase {
    RegisterAccountByGuestOutcome register(RegisterAccountByGuestCommand command) throws RegisterAccountByGuestException;
}
