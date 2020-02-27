package ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.usecases;

import ir.maktab.java32.projects.onlineexamsmanagement.core.anotatitons.UseCase;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.commands.SubmitStatusUserByManagerCommand;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.exceptions.SubmitStatusUserByManagerException;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.outcomes.SubmitStatusUserByManagerOutcome;
import org.springframework.security.access.annotation.Secured;

@UseCase
@Secured("ROLE_MANAGER")
public interface SubmitStatusUserByManagerUseCase {
    SubmitStatusUserByManagerOutcome submit(SubmitStatusUserByManagerCommand command) throws SubmitStatusUserByManagerException;
}
