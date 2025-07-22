package stringParser;

import java.time.LocalDate;
import java.util.Optional;

public class StringParser {

    private final String data;

    public StringParser(String data) {
        this.data = data;
    }

    /* id=100&name=User1&birthDate=2025-01-01&hobby=running
     *  &,=
     * */

    public Optional<String> getString(String key) {
        String[] splitData = data.split("&");
        for (String split : splitData) {
            String[] keyValue = split.split("=");
            if (keyValue.length == 2 && keyValue[0].equals(key)) {
                return Optional.of(keyValue[1]);
            }
        }
        return Optional.empty();
    }

    public String getString(String key, String defaultValue) {
        return getString(key).orElse(defaultValue);
    }

    public Optional<Integer> getInt(String key) {
        Optional<String> value = getString(key);
        return value.map(Integer::parseInt);
    }

    public Integer getInt(String key, int defaultValue) {
        Optional<Integer> value = getInt(key);
        return value.orElse(defaultValue);
    }

    public Optional<Long> getLong(String key) {
        Optional<String> value = getString(key);
        return value.map(Long::parseLong);
    }

    public Long getLong(String key, long defaultValue) {
        Optional<Long> value = getLong(key);
        return value.orElse(defaultValue);
    }

    public Optional<LocalDate> getLocalDate(String key) {
        Optional<String> value = getString(key);
        return value.map(LocalDate::parse);
    }

    public LocalDate getLocalDate(String key, LocalDate defaultValue) {
        Optional<LocalDate> value = getLocalDate(key);
        return value.orElse(defaultValue);
    }

}