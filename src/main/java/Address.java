import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
    @Id @GeneratedValue
    private Integer id;
    private String street;
    private String alley;

    public Address(Integer id, String street, String alley) {
        this.id = id;
        this.street = street;
        this.alley = alley;
    }

    public Address() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAlley() {
        return alley;
    }

    public void setAlley(String alley) {
        this.alley = alley;
    }
}
