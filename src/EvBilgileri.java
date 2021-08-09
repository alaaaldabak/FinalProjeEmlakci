import java.lang.*;
public class EvBilgileri {
    int homeNo;
    String homeCity,homeDistrict,homeAdress;
    float homeSquare,homePrice;
    int homeRooms,homeFloor,homeOld;
    int homeStatus;

    public EvBilgileri() {

    }

    public EvBilgileri(int homeNo, String homeCity, String homeDistrict, String homeAdress, float homeSquare, float homePrice, int homeRooms, int homeFloor, int homeOld, int homeStatus) {
        this.homeNo = homeNo;
        this.homeCity = homeCity;
        this.homeDistrict = homeDistrict;
        this.homeAdress = homeAdress;
        this.homeSquare = homeSquare;
        this.homePrice = homePrice;
        this.homeRooms = homeRooms;
        this.homeFloor = homeFloor;
        this.homeOld = homeOld;
        this.homeStatus = homeStatus;
    }

    public int getHomeNo() {
        return homeNo;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public String getHomeDistrict() {
        return homeDistrict;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public float getHomeSquare() {
        return homeSquare;
    }

    public float getHomePrice() {
        return homePrice;
    }

    public int getHomeRooms() {
        return homeRooms;
    }

    public int getHomeFloor() {
        return homeFloor;
    }

    public int getHomeOld() {
        return homeOld;
    }

    public int isHomeStatus() {
        return homeStatus;
    }

    public void setHomeNo(int homeNo) {
        this.homeNo = homeNo;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }

    public void setHomeDistrict(String homeDistrict) {
        this.homeDistrict = homeDistrict;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    public void setHomeSquare(float homeSquare) {
        this.homeSquare = homeSquare;
    }

    public void setHomePrice(float homePrice) {
        this.homePrice = homePrice;
    }

    public void setHomeRooms(int homeRooms) {
        this.homeRooms = homeRooms;
    }

    public void setHomeFloor(int homeFloor) {
        this.homeFloor = homeFloor;
    }

    public void setHomeOld(int homeOld) {
        this.homeOld = homeOld;
    }

    public void setHomeStatus(int homeStatus) {
        this.homeStatus = homeStatus;
    }
}
