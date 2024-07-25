package net.media.training.live.srp;

public class Address{
    private String addressStreet;
    private String addressCity;
    private String addressCountry;

    public String getAddressStreet() {
        return addressStreet;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }


    public Address(String addressStreet,String addressCity,String addressCountry){
        this.addressStreet=addressStreet;
        this.addressCity=addressCity;
        this.addressCountry=addressCountry;
    }
}