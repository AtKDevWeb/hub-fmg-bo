package lol.fmg.hub.models.users;

import jakarta.persistence.*;

@Entity
public class Structure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column(nullable = false, length = 255)
    private String logo;
    @Column(length = 50)
    private String phone;
    @Column(length = 50)
    private String streetNumber;
    @Column(length = 50)
    private String streetNumberComplement;
    @Column(length = 150)
    private String streetAddress;
    @Column(length = 5)
    private Integer zipCode;
    @Column (length = 50)
    private String city;
    @Column (length = 50)
    private String country;
    @Column(length = 155)
    private String urlEmail;
    @Column(length = 155)
    private String urlWebsite;
    @Column(nullable = false, length = 50)
    private String type;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetNumberComplement() {
        return streetNumberComplement;
    }

    public void setStreetNumberComplement(String streetNumberComplement) {
        this.streetNumberComplement = streetNumberComplement;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUrlEmail() {
        return urlEmail;
    }

    public void setUrlEmail(String urlEmail) {
        this.urlEmail = urlEmail;
    }

    public String getUrlWebsite() {
        return urlWebsite;
    }

    public void setUrlWebsite(String urlWebsite) {
        this.urlWebsite = urlWebsite;
    }
}
