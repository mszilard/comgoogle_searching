package search_test;

import org.testng.annotations.*;

public class SearchGoogleTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void searchOnGoogle() {
        // Given I open "https://www.google.com/"
        actionwords.iOpenUrl("https://www.google.com/");
        // When I search for "RTX 2080"
        actionwords.iSearchForVga("RTX 2080");
        // Then a links to "https://www.arukereso.hu" is shown in the results
        actionwords.aLinkToStoreLinkIsShownInTheResults("https://www.arukereso.hu");
    }
}