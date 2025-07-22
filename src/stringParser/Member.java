/* The user sends data in the form
 id=100&name=User1&birthDate=2025-01-01&hobby=running
*/
package stringParser;

import java.time.LocalDate;

public class Member {

    private Long id;
    private String name;
    private LocalDate birthDate;
    private String hobby;
    // ~~~

    public Member() {
        // Default constructor
    }

    public Member(Long id, String name, LocalDate birthDate, String hobby) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.hobby = hobby;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Member{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", birthDate=" + birthDate +
            ", hobby='" + hobby + '\'' +
            '}';
    }

}
