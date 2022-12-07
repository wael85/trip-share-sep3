package via.sep3.grpcserver.Entities;

import javax.persistence.*;

@Entity
@Table(name = "login" ,schema = "trip_share")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    @JoinColumn(name = "user_id",nullable = false,unique = true,referencedColumnName = "email")
    private User user;

    @Column(nullable = false)
    private String password;

    public Login() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
