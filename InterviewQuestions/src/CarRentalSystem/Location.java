package CarRentalSystem;

public class Location {
  private String address;
  private String city;
  private String state;
  private String zipCode;
  private String country;

  public Location(String address, String city, String state, String zipCode, String country) {
    this.address = address;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
    this.country = country;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

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

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
}
