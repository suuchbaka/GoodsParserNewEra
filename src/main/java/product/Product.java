package product;

// Класс, описывающий продукт

// Создано 17.07.2017 Иваном Силаевым.

public class Product {
    // Индфикатор
    private int id;
    // Имя продукта
    private String name;
    // Категория
    private Category category;
    // Штрихкод
    private long barcode;
    // Описание
    private String description;
    // Состав
    private String consist;
    // Вес
    private float weight;
    // Объем
    private float volume;
    // Энергетический состав
    private String energyConsist;
    // Условия хранения
    private String storeRules;
    // Производитель
    private String manufacturer;


    public Product(String name, long barcode, String description, String consist, float weight, float volume, String energyConsist, String storeRules, String manufacturer) {
        this.name = name;
        this.barcode = barcode;
        this.description = description;
        this.consist = consist;
        this.weight = weight;
        this.volume = volume;
        this.energyConsist = energyConsist;
        this.storeRules = storeRules;
        this.manufacturer = manufacturer;
    }

    public class Category {
        private String name;

        public Category(String name) {
            this.name = name;
        }
    }
}
