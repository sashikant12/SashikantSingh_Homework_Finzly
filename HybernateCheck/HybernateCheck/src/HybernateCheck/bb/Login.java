package HybernateCheck.bb;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
    int id;
    String Username;
    String PassWord;



    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", username='" + Username + '\'' +
                ", password='" + PassWord + '\'' +
                '}';
    }
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        this.PassWord = passWord;
    }
}
