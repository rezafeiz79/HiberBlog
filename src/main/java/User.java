import javax.persistence.*;

@Entity
public class User {
    @Id @GeneratedValue
    private Integer id;
    private String userName;
    private String nationalCode;
    private String birthDay;
    private String password;
    @ManyToOne(cascade = CascadeType.ALL)
    private Role role;
    @OneToOne
    private Address address;

    public User(Integer id, String userName, String nationalCode, String birthDay, String password, Role role, Address address) {
        this.id = id;
        this.userName = userName;
        this.nationalCode = nationalCode;
        this.birthDay = birthDay;
        this.password = password;
        this.role = role;
        this.address = address;
    }

    public User() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
