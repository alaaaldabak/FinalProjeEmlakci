import java.lang.*;
public class Clientİnformation {
    int clientNo;
    String clientNameSurname,clientMail,clientAdress;
    float clientTelefon;

    public Clientİnformation() {

    }

    public Clientİnformation(int clientNo, String clientNameSurname, String clientMail, String clientAdress, float clientTelefon) {
        this.clientNo = clientNo;
        this.clientNameSurname = clientNameSurname;
        this.clientMail = clientMail;
        this.clientAdress = clientAdress;
        this.clientTelefon = clientTelefon;
    }

    public int getClientNo() {
        return clientNo;
    }

    public String getClientNameSurname() {
        return clientNameSurname;
    }

    public String getClientMail() {
        return clientMail;
    }

    public String getClientAdress() {
        return clientAdress;
    }

    public float getClientTelefon() {
        return clientTelefon;
    }

    public void setClientNo(int clientNo) {
        this.clientNo = clientNo;
    }

    public void setClientNameSurname(String clientNameSurname) {
        this.clientNameSurname = clientNameSurname;
    }

    public void setClientMail(String clientMail) {
        this.clientMail = clientMail;
    }

    public void setClientAdress(String clientAdress) {
        this.clientAdress = clientAdress;
    }

    public void setClientTelefon(float clientTelefon) {
        this.clientTelefon = clientTelefon;
    }
}
