package ChichiSuperM;

public class Addresses {
    private Addresses cityName;
    private Addresses countryName;
    private Addresses houseNumber;

    public Addresses(Addresses cityName, Addresses countryName, Addresses houseNumber, Addresses street, Addresses state) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.houseNumber = houseNumber;
        this.street = street;
        this.state = state;
    }

    private Addresses street;
    private Addresses state;

}
