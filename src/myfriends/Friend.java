package myfriends;

public class Friend {
    private String name;
    private String email;
    private  int phoneNumber;


    public Friend (String name, String email, int phoneNumber) {
      setName(name);
      setEmail(email);
      setPhoneNumber(phoneNumber);
    }

    public void setName(String name) {

        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public  void setPhoneNumber (int phoneNumber) {
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
