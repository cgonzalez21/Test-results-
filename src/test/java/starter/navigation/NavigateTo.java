package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {


    public static Performable logInWordpressPage() {
        return Task.where("{0} log in on the wordpress opensourcecms login page",
                Open.browserOn().the(WordpressLoginPage.class)
        );
    }
}