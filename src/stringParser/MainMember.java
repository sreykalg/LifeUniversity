package stringParser;

import java.time.LocalDate;
import java.util.Optional;

public class MainMember {
    public static void main(String[] agrs) {
        StringParser strParser = new StringParser("id=100&name=User1&birthDate=2025-01-01&hobby=running");

        Optional<Long> idOpt = strParser.getLong("id");
        if (idOpt.isEmpty()) {
            throw new IllegalStateException("ID not found in the input string");
        }
        String name = strParser.getString("name", "Unknown");
        LocalDate birthDate = strParser.getLocalDate("birthDate", LocalDate.MIN);
        String hobby = strParser.getString("hobby", "no hobby!");

        Member member = new Member(idOpt.get(), name, birthDate, hobby);
        System.out.println("member = " + member);
    }
}
