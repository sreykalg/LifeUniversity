package stringParser;

import java.time.LocalDate;

public class MainMember {
    public static void main(String[] agrs) {
        StringParser strParser = new StringParser("id=100&name=User1&birthDate=2025-01-01&hobby=running");
        Member member = new Member();

        Long id = Long.parseLong(strParser.getString("id"));
        String name = strParser.getString("name");
        LocalDate birthDate = LocalDate.parse(strParser.getString("birthDate"));
        String hobby = strParser.getString("hobby", "no hobby!");

        member.setId(id);
        member.setName(name);
        member.setBirthDate(birthDate);
        member.setHobby(hobby);

        System.out.println("id : " + member.getId());
        System.out.println("name : " + member.getName());
        System.out.println("birthDate : " + member.getBirthDate());
        System.out.println("hobby : " + member.getHobby());
    }
}
