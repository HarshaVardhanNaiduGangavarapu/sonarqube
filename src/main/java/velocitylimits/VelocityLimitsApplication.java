package velocitylimits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import velocitylimits.domain.service.impl.LoadFundsService;

/**
 * @author harshagangavarapu
 */
@SpringBootApplication
@Configuration
public class VelocityLimitsApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(VelocityLimitsApplication.class, args);
        // execute fund loading
        context.getBean(LoadFundsService.class).executeFundsLoadingToAccounts();
    }
}
