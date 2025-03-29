package Q_04;

class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner(String ownerName, String phoneNo) {
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

class Bicycle {
    private Owner owner;

    public Bicycle() {
        this.owner = new Owner("Unknown", "0000000000");
    }

    public Bicycle(String name, String num) {
        this.owner = new Owner(name, num);
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getOwnerName() {
        return owner.getOwnerName();
    }

    public String getPhoneNo() {
        return owner.getPhoneNo();
    }

    public void setOwnerName(String name) {
        owner.setOwnerName(name);
    }

    public void setPhoneNo(String num) {
        owner.setPhoneNo(num);
    }
}

public class BicycleTest {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle("Rasindu Chandima", "072-4567986");

        System.out.println("Owner Name: " + bike.getOwnerName());
        System.out.println("Phone No: " + bike.getPhoneNo());

        bike.setOwnerName("chiran");
        bike.setPhoneNo("077-2057945");

        System.out.println("Updated Owner Name: " + bike.getOwnerName());
        System.out.println("Updated Phone No: " + bike.getPhoneNo());
    }
}
