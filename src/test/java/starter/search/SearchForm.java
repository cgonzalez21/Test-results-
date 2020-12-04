package starter.search;

import org.openqa.selenium.By;

public class SearchForm {
    public static By USER_LOGIN = By.id("user_login");
    public static By USER_PASS = By.id("user_pass");
    public static By LOG_IN_BTN = By.id("wp-submit");
    public static By POST_BTN = By.linkText("Posts");
    public static By ADD_POST_BTN = By.linkText("Add New");
    public static By POST_TITLE = By.id("post-title-0");
    public static By POST_PARAGRAPH = By.linkText("Preview");
    public static By PUBLISH_BTN = By.cssSelector("button[type='button'][aria-disabled='false'][class='components-button editor-post-publish-panel__toggle is-button is-primary']");
    public static By PUBLISH_POST_BTN = By.cssSelector("button[type='button'][aria-disabled='false'][class='components-button editor-post-publish-button is-button is-default is-primary is-large']");
    public static By X_BTN = By.cssSelector("button[type='button'][aria-label='Disable tips']");
    public static By VIEW_POST = By.cssSelector("a[class='components-button components-notice__action is-link']");
}
