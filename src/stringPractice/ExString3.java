// 3. Search Count
/* Find the character string as key in str and get the number of found characters
* use indexOf()
* result
count = 9
* */
package stringPractice;

import java.util.Arrays;

import static java.util.Arrays.stream;

public class ExString3{

    public static void main(String[] args) {
        String str = "Life University was established to educate Cambodian students with the truth and love of God so "
                + "that they can love their neighbors as themselves, "
                + "have respect for their parents as the Bible says, "
                + "and contribute to the growth and prosperity of the Christian community "
                + "and the national economy of Cambodia.";
        String key = "the";

        int countKey = 0;
        int startIndex = 0;
        while((startIndex = str.indexOf(key, startIndex)) != -1 ){
            countKey++;
            startIndex += key.length();
        }
        System.out.println("count : " + countKey);


    }

}

