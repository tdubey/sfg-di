package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("FR")
@Service("i18nService")
public class FrenchGreetingService implements IGreetingService {
    @Override
    public String getGreetings() {
        return "Bonjour le monde";
    }
}
