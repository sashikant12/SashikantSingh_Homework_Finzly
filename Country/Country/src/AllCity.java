public class AllCity {
    private String city;

    public AllCity(String city) {
        this.city = city;
    }

    public AllCity() {
    }

    @Override
    public String toString() {
        return city + " " ;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
