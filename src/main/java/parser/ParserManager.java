package parser;

import org.jsoup.select.Elements;

import java.io.IOException;

public class ParserManager {
    // Класс, управляющий всеми парсерами

    // Создано 17.07.2017 Иваном Силаевым.


    // Ссылки на все категории.
    private Elements links;

    public ParserManager() throws IOException {
        // URL каталога
        String url = "http://www.goodsmatrix.ru/GMMap.aspx";
        links = Categories.parseCategoriesLinks(url);
    }
}
