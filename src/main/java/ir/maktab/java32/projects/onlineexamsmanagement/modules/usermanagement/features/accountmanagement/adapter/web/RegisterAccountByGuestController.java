package ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.adapter.web;

import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.commands.RegisterAccountByGuestCommand;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.exceptions.RegisterAccountByGuestException;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.outcomes.RegisterAccountByGuestOutcome;
import ir.maktab.java32.projects.onlineexamsmanagement.modules.usermanagement.features.accountmanagement.application.port.in.usecases.RegisterAccountByGuestUseCase;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/")
public class RegisterAccountByGuestController {

    final RegisterAccountByGuestUseCase registerAccountByGuestUseCase;

    public RegisterAccountByGuestController(RegisterAccountByGuestUseCase registerAccountByGuestUseCase) {
        this.registerAccountByGuestUseCase = registerAccountByGuestUseCase;
    }

    @PostMapping("register")
    private RegisterAccountByGuestOutcome registerAccountByGuestOutcome(@RequestBody RegisterAccountByGuestCommand command) throws RegisterAccountByGuestException {
        return registerAccountByGuestUseCase.register(command);
    }
}
