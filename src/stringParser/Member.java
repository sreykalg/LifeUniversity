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
}


