package logger;

// Класс, логгер

// Создано 17.07.2017 Иваном Силаевым.

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LoggerManager {
    private static Logger logger;

    public static Logger getLogger(Class<?> clazz) {
        return logger = LogManager.getLogger(clazz);
    }
}
