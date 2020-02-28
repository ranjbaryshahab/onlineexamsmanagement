package ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.usecases;

import ir.maktab.java32.projects.onlineexamsmanagement.core.anotatitons.UseCase;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.commands.LoginToAccountByUserCommand;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.exceptions.LoginToAccountByUserException;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.outcomes.LoginToAccountByUserOutcome;

@UseCase
public interface LoginToAccountByUserUseCase {
    LoginToAccountByUserOutcome login(LoginToAccountByUserCommand command) throws LoginToAccountByUserException;
}
