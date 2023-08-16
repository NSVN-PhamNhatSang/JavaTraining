package Practice3;

public class VehicleOwner {
    private String cmndNumber;
    private String fullName;
    private String email;

    public VehicleOwner(String cmndNumber, String fullName, String email) {
        this.cmndNumber = cmndNumber;
        this.fullName = fullName;
        this.email = email;
    }

    public String getCmndNumber() {
        return cmndNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Owner: " + fullName +
               "\nCMND Number: " + cmndNumber +
               "\nEmail: " + email;
    }
}
