package ru.sanctio.datastoremicro.config;

import java.util.Objects;

/**
 *  Для создания строк-ключей для хранения данных в Redis
 */
public class KeyHelper {

    private final static String defaultPrefix = "app";

    private static String prefix = null;

    public static void setPrefix(String keyPrefix) {
        prefix = keyPrefix;
    }

    public static String getKey(String key) {
        return getPrefix() + ":" + key;
    }

    public static String getPrefix() {
        return Objects.requireNonNullElse(prefix, defaultPrefix);
    }
}
