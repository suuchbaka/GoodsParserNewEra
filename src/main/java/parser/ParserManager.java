package parser;

import org.jsoup.select.Elements;

import javax.swing.text.html.parser.Parser;
import java.io.IOException;

public class ParserManager {
    // Класс, управляющий всеми парсерами

    // Создано 17.07.2017 Иваном Силаевым.

    private String url = "http://www.goodsmatrix.ru/GMMap.aspx";


    // Ссылки на все категории.
    private Elements links;

    public ParserManager() throws IOException {
        links = Categories.parseCategoriesLinks(url);
    }
}
