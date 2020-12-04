package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.remote.server.handler.GetElementText;

public class SearchFor {

    public static Performable user(String term) {
        return Task.where("{0} attempts to search for #term",
                Clear.field(SearchForm.USER_LOGIN),
                Enter.theValue(term).into(SearchForm.USER_LOGIN)
        ).with("term").of(term);
    }

    public static Performable password(String term) {
        return Task.where("{0} attempts to search for #term",
                Clear.field(SearchForm.USER_PASS),
                Enter.theValue(term).into(SearchForm.USER_PASS)
        ).with("term").of(term);
    }

    public static Performable pressLogInBtn() {
        return Task.where("{0} ",
                Click.on(SearchForm.LOG_IN_BTN)
        );
    }

    public static Performable pressPostBtn() {
        return Task.where("{0} ",
                Click.on(SearchForm.POST_BTN)
        );
    }

    public static Performable pressAddPostBtn() {
        return Task.where("{0} ",
                Click.on(SearchForm.ADD_POST_BTN)
        );
    }

    public static Performable addPostTitle(String title) {
        return Task.where("{0} type the Post title #title",
                Click.on(SearchForm.X_BTN),
                Click.on(SearchForm.POST_TITLE),
                Enter.theValue(title).into(SearchForm.POST_TITLE)
        ).with("title").of(title);
    }


    public static Performable addPostParagraph(String paragraph) {
        return Task.where("{0} type the Post title #paragraph",
                Clear.field(SearchForm.POST_PARAGRAPH),
                Enter.theValue(paragraph).into(SearchForm.POST_PARAGRAPH)
        ).with("paragraph").of(paragraph);
    }


    public static Performable pressBtnPublishPost() {
        return Task.where("{0} ",
                Click.on(SearchForm.PUBLISH_BTN)
        );
    }

    public static Performable publishPost() {
        return Task.where("{0} ",
                Click.on(SearchForm.PUBLISH_POST_BTN)
        );
    }

    public static Performable pressBtnViewPost() {
        return Task.where("{0} ",
                Click.on(SearchForm.VIEW_POST)
        );
    }


}
