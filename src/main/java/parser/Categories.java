package parser;

import logger.LoggerManager;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.logging.Level;


class Categories {
    // Класс, парсит категории

    // Создано 17.07.2017 Иваном Силаевым.

    static Elements parseCategoriesLinks(String url) throws IOException {

        LoggerManager.getLogger(Categories.class).info("PARSER: starting parsing categories");

        Connection.Response goodsResponse = Jsoup.connect(url)
                .method(Connection.Method.GET)
                .userAgent("Mozilla")
                .execute();

        Document doc = goodsResponse.parse();

        Elements catalogueTable = doc.select("table[cellspacing=10]");

        catalogueTable.select("a[href]");

        if(catalogueTable.size() != 0) {
            LoggerManager.getLogger(Categories.class).info("PARSER: categories parsed, total size: " + catalogueTable.size());
        }

        return catalogueTable;
    }

}
