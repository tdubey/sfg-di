package guru.springframework.sfgdi.Controllers;

import guru.springframework.sfgdi.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final IGreetingService greetingService;

    public MyController(@Qualifier("i18nService")IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getMessage()
    {
        System.out.println("I am in getMessage");

        return greetingService.getGreetings();
    }
}

