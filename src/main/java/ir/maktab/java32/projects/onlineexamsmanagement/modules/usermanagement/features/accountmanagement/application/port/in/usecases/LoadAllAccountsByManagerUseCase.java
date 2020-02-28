package ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.usecases;

import ir.maktab.java32.projects.onlineexamsmanagement.core.anotatitons.UseCase;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.commands.LoadAllAccountsByManagerCommand;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.exceptions.LoadAllAccountsByManagerException;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.outcomes.LoadAllAccountsByManagerOutcome;
import org.springframework.security.access.annotation.Secured;

@UseCase
@Secured("ROLE_MANAGER")
public interface LoadAllAccountsByManagerUseCase {
    LoadAllAccountsByManagerOutcome loadAll(LoadAllAccountsByManagerCommand command) throws LoadAllAccountsByManagerException;
}
