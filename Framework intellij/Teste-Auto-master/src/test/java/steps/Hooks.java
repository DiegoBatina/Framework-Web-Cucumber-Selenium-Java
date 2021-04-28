package steps;

import support.BaseSteps;
import io.cucumber.core.api.Scenario;
import org.junit.After;
import org.junit.Before;

public class Hooks extends BaseSteps {

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("--- Cenário Iniciado >>> " + scenario.getName() + " <<< ---");
    }

    @After
    public void afterScenario(Scenario scenario) {
        System.out.println("\n--- Cenário finalizado >>> " + scenario.getName() + " <<< ---");
        scenario.write("URL: " + driver.getCurrentUrl());

        driver.quit();
        return;
    }
}
