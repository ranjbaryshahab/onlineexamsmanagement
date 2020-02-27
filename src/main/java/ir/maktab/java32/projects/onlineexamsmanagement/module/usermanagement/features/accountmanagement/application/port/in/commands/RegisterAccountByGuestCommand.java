package ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.commands;

import ir.maktab.java32.projects.onlineexamsmanagement.core.anotatitons.UseCaseCommand;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor

@UseCaseCommand
public class RegisterAccountByGuestCommand {
    private String username;

    private String password;

    private String role;
}
