package ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.usecases;

import ir.maktab.java32.projects.onlineexamsmanagement.core.anotatitons.UseCase;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.commands.UpdateAccountByUserCommand;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.exceptions.UpdateAccountByUserException;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.outcomes.UpdateAccountByUserOutcome;
import org.springframework.security.access.annotation.Secured;

@UseCase
@Secured("ROLE_USER")
public interface UpdateAccountByUserUseCase {
    UpdateAccountByUserOutcome update(UpdateAccountByUserCommand command) throws UpdateAccountByUserException;
}
