import java.lang.*;
public class ClientHomeList {
//    EvBilgileri home;
//    Clientİnformation clientInfo;

    int clientNo;
    String clientNameSurname,clientMail,clientAdress;
    float clientTelefon;
    int homeNo;
    String homeCity,homeDistrict,homeAdress;
    float homeSquare,homePrice;
    int homeRooms,homeFloor,homeOld;
    int homeStatus;

    public ClientHomeList() {
    }

    public ClientHomeList(int clientNo, String clientNameSurname, String clientMail, String clientAdress, float clientTelefon, int homeNo, String homeCity, String homeDistrict, String homeAdress, float homeSquare, float homePrice, int homeRooms, int homeFloor, int homeOld, int homeStatus) {
        this.clientNo = clientNo;
        this.clientNameSurname = clientNameSurname;
        this.clientMail = clientMail;
        this.clientAdress = clientAdress;
        this.clientTelefon = clientTelefon;
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
}
