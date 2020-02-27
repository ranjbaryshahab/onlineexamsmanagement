package ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.adapter.web;

import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.commands.LoginToAccountByUserCommand;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.exceptions.LoginToAccountByUserException;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.outcomes.LoginToAccountByUserOutcome;
import ir.maktab.java32.projects.onlineexamsmanagement.module.usermanagement.features.accountmanagement.application.port.in.usecases.LoginToAccountByUserUseCase;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/")
public class LoginToAccountByUserController {
    final LoginToAccountByUserUseCase loginToAccountByUserUseCase;

    public LoginToAccountByUserController(LoginToAccountByUserUseCase loginToAccountByUserUseCase) {
        this.loginToAccountByUserUseCase = loginToAccountByUserUseCase;
    }

    @PostMapping("login")
    private LoginToAccountByUserOutcome loginToAccountByUserOutcome(@RequestBody LoginToAccountByUserCommand command) throws LoginToAccountByUserException {
        return loginToAccountByUserUseCase.login(command);
    }
}
