package parser;

import logger.LoggerManager;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import variables.ParserVariables;

import java.io.IOException;
import java.util.ArrayList;


class CategoriesParser {
    // Класс, парсит категории

    // Создано 17.07.2017 Иваном Силаевым.

    // Метод: парсятся категории
    static Elements parseCategoriesLinks(String url) throws IOException {

        // LoggerManager.getLogger(CategoriesParser.class).info("PARSER: starting parsing categories");

        Connection.Response goodsResponse = Jsoup.connect(url)
                .method(Connection.Method.GET)
                .userAgent("Mozilla")
                .timeout(ParserVariables.TIMEOUT)
                .execute();

        Document doc = goodsResponse.parse();

        Elements catalogueTable = doc.select("table[cellspacing=10]");



        return catalogueTable.select("a[href]");
    }

    static ArrayList<String> getLinksAsList(Elements links) {
        ArrayList<String> linksAsList = new ArrayList<String>();
        for(Element e : links) {
            if(e.attr("href").contains("http")) {
                linksAsList.add(e.attr("href"));
            }

            else {
                String data = "http://www.goodmatrix.ru/" + e.attr("href");
                linksAsList.add(data);
            }
        }

        return linksAsList;
    }

}
