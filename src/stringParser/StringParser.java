package stringParser;

public class StringParser {

    private final String data;

    public StringParser(String data) {
        this.data = data;
    }

    /* id=100&name=User1&birthDate=2025-01-01&hobby=running
    *  &,=
    * */

    public String getString(String key) {
        String[] splitData = data.split("&");
        for (int i = 0; i < splitData.length; i++) {
            String[] keyValue = splitData[i].split("=");
            if (keyValue.length == 2 && keyValue[0].equals(key)) {
                return keyValue[1];
            }
        }
        return null;
    }

    public String getString(String key, String defaultValue) {
        String result = getString(key);
        if (result != null) {
            return result;
        } else {
            return defaultValue;
        }
    }

    public int getInt(String key) {
        String value = getString(key);
        if (value == null) {
            throw new IllegalArgumentException("not found!");

        }
        return Integer.parseInt(value);
    }

    public int getInt(String key, int defaultValue) {
        String value = getString(key);
        if (value != null) {
            return Integer.parseInt(value);
        } else {
            return defaultValue;
        }
    }

}