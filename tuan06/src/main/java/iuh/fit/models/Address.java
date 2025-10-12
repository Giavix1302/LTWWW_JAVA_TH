package iuh.fit.models;
import org.springframework.stereotype.Component;

@Component
public class Address {
    private String city;
    private String state;
    private String country;

    // Constructor mặc định
    public Address() {
        // Khởi tạo giá trị mặc định
        this.city = "Da Nang";
        this.state = "DN";
        this.country = "Vietnam";
    }

    // Constructor có tham số
    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    // Getter và Setter
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return city + ", " + state + ", " + country;
    }
}
