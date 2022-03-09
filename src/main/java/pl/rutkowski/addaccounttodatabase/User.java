package pl.rutkowski.addaccounttodatabase;

import javax.persistence.*;

@Entity
@Table(name = "Użytkownik")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String gender;
    @Enumerated(EnumType.STRING)
    private Hobby hobby;

    public User(String username, String password, String gender, Hobby hobby) {
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.hobby = hobby;
    }

    public User() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = Hobby.valueOf(hobby);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
