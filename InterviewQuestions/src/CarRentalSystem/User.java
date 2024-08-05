package CarRentalSystem;

public class User {
  private int userId;
  private String name;
  private String drivingLicense;

  public User(int userId, String name, String drivingLicense) {
    this.userId = userId;
    this.name = name;
    this.drivingLicense = drivingLicense;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDrivingLicense() {
    return drivingLicense;
  }

  public void setDrivingLicense(String drivingLicense) {
    this.drivingLicense = drivingLicense;
  }
}
