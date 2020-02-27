package ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.outcomes;

import ir.maktab.java32.projects.onlineexamsmanagement.core.anotatitons.UseCaseOutcome;
import lombok.Value;

@Value

@UseCaseOutcome
public class RegisterAccountByGuestOutcome {
    Long accountId;
}
