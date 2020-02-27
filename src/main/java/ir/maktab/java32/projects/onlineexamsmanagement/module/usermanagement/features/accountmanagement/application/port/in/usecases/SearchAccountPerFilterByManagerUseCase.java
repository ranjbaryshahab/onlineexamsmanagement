package ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.usecases;

import ir.maktab.java32.projects.onlineexamsmanagement.core.anotatitons.UseCase;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.commands.SearchAccountPerFilterByManagerCommand;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.exceptions.SearchAccountPerFilterByManagerException;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.outcomes.SearchAccountPerFilterByManagerOutcome;
import org.springframework.security.access.annotation.Secured;

@UseCase
@Secured("ROLE_MANAGER")
public interface SearchAccountPerFilterByManagerUseCase {
    SearchAccountPerFilterByManagerOutcome searchAccount(SearchAccountPerFilterByManagerCommand command) throws SearchAccountPerFilterByManagerException;
}
