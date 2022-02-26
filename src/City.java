public class City {

    private String zipcode;
    private String city;

    public City(String postNummer, String city) {
        this.zipcode = postNummer;
        this.city = city;
    }


    public String getZipcode() {
        return zipcode;
    }


    @Override
    public String toString() {
        return city;
    }
}
