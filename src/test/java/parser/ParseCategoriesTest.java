package parser;

import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;
import variables.ParserVariables;


import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.hamcrest.CoreMatchers.containsString;

import java.io.IOException;

public class ParseCategoriesTest {

    @Test
    public void testCategoriesNotNull() throws IOException {
        for(final Element expected : CategoriesParser.parseCategoriesLinks(ParserVariables.URL)) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testLinksNotNull() throws IOException {
        for(final String expected : CategoriesParser.getLinksAsList(CategoriesParser.parseCategoriesLinks(ParserVariables.URL))) {
            assertNotNull(expected);
            assertThat(expected, containsString("html"));
        }
    }
}
