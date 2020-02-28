package ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.usecases;

import ir.maktab.java32.projects.onlineexamsmanagement.core.anotatitons.UseCase;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.commands.DeleteAccountByUserCommand;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.exceptions.DeleteAccountByUserException;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.outcomes.DeleteAccountByUserOutcome;
import org.springframework.security.access.annotation.Secured;

@UseCase
@Secured("ROLE_USER")
public interface DeleteAccountByUserUseCase {
    DeleteAccountByUserOutcome delete(DeleteAccountByUserCommand command) throws DeleteAccountByUserException;
}
