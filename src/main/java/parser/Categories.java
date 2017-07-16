package parser;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;


class Categories {
    // Класс, парсит категории

    // Создано 17.07.2017 Иваном Силаевым.

    static Elements parseCategoriesLinks(String url) throws IOException {
        Connection.Response goodsResponse = Jsoup.connect(url)
                .method(Connection.Method.GET)
                .userAgent("Mozilla")
                .execute();

        Document doc = goodsResponse.parse();

        Elements catalogueTable = doc.select("table[cellspacing=10]");



        return catalogueTable.select("a[href]");
    }

}
