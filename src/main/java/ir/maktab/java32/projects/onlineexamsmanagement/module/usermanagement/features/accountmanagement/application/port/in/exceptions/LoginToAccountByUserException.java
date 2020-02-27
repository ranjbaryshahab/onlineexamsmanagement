package ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.exceptions;

import ir.maktab.java32.projects.onlineexamsmanagement.core.anotatitons.UseCaseException;

@UseCaseException
public class LoginToAccountByUserException extends Exception {
    public LoginToAccountByUserException(String message) {
        super(message);
    }
}
