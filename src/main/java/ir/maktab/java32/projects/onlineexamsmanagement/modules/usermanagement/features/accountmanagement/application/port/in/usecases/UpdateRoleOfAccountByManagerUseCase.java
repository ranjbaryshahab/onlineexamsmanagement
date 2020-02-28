package ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.usecases;

import ir.maktab.java32.projects.onlineexamsmanagement.core.anotatitons.UseCase;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.commands.UpdateRoleOfAccountByManagerCommand;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.exceptions.UpdateRoleOfAccountByManagerException;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.outcomes.UpdateRoleOfAccountByManagerOutcome;
import org.springframework.security.access.annotation.Secured;

@UseCase
@Secured("ROLE_MANAGER")
public interface UpdateRoleOfAccountByManagerUseCase {
    UpdateRoleOfAccountByManagerOutcome updateRole(UpdateRoleOfAccountByManagerCommand command) throws UpdateRoleOfAccountByManagerException;
}
