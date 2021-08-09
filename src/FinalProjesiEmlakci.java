import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FinalProjesiEmlakci {
     static String userName="Alaa",password="123";
    static List<EvBilgileri> homeDetailes = new ArrayList<>() ;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userInput, passInput;
        // test kullanıcı Adı veya Şifresi doğru mu ?;
        do {
            System.out.println("Lütfen Kullanıcı Adı giriniz:");
            userInput = input.nextLine();
            System.out.println("Lütfen  Kullanıcı Şifresi giriniz:");
            passInput = input.nextLine();
            if (!isUserNameAndPasswordTrue(userInput, passInput)) {
                System.out.println("Yanlış girdiğiniz Kullanıcı Adı yada Şifresi! Lütfen tekrar giriniz!");
            } else
                break;

        } while (true);
        // Yeni Ev Ekleme
        while (true){
            int select = selectionNo();

            if (select == 1) {
                addHome();
            } else if (select == 2) {
                searchHome();


            } else if (select == 3) {

            } else {
                System.out.println("Lütfen doğru bir operasyon seçiniz!");
            }
        }

    }
    // fonksyoun  kullanıcı Adı veya Şifresi doğru mu ?;
    public static boolean isUserNameAndPasswordTrue(String userInput, String passInput){
        boolean isTrue = false;
        if(userInput.equals(userName) && (passInput.equals(password)) ){
            isTrue = true;
        }
        return isTrue;
    }
    // listedenki seçenek olacak
    public static int selectionNo(){
        Scanner select = new Scanner(System.in);
        boolean isNumberWrong = true;
        String inputCheck = "";
        while (isNumberWrong) {
            System.out.println("Lütfen birini seçiniz:\n 1. Ev Ekleme \n 2. Ev Sorgulama \n 3. Ev Satılan veya Kiralananlar\n ");
            try {
                inputCheck = select.next();
                if (Integer.class.isInstance(Integer.parseInt(inputCheck))) {

                    if (inputCheck.equals("1") || inputCheck.equals("2") || inputCheck.equals("3")) {
                        isNumberWrong = false;
                    } else {
                        System.out.println("Lütfen 1 yada 2 yada 3 seçiniz!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Girdiğinz sayı doğru değildir.Lütfen tekrar deneyiniz!");
            }
        }
        return Integer.parseInt(inputCheck);

    }
    //fonksyoun yeni ev eklemek için
    public static void addHome(){
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yeni Ev Bilgileri giriniz:");
        // int homeNo
        System.out.println("İl :");
        String homeCity = input.nextLine();
        System.out.println("İlçe :");
        String homeDistrict = input.nextLine();
        System.out.println("Adres :");
        String homeAdress = input.nextLine();
        System.out.println("Ev Alanı :");
        float homeSquare = input.nextFloat();
        System.out.println("Ev Fıyatı :");
        float  homePrice= input.nextFloat();
        System.out.println("Ev Oda Sayısı :");
        int homeRooms = input.nextInt();
        System.out.println("Ev Katı :");
        int homeFloor = input.nextInt();
        System.out.println("Ev Yaşı :");
        int homeOld = input.nextInt();
        System.out.println("Ev eğer kiralamak 0'e pasınız, satılık için 1'e pasınız!");
        int homeStatus = input.nextInt();
        homeDetailes.add(new EvBilgileri( homeDetailes.size()+1,  homeCity,  homeDistrict,  homeAdress,  homeSquare,  homePrice,  homeRooms,  homeFloor,  homeOld,homeStatus));


    }
    //fonksyoun  ev sorgulama için
    public static void searchHome(){
        System.out.println("Ev sorgulamak için hangisine sorgulacaksin:");
        System.out.println("İl seçiniz:");
        List<String> city = new ArrayList<>();

        for (EvBilgileri evfound : homeDetailes){
            boolean found = false;
            String cityName = evfound.homeCity;
            if (city.size()!=0){
             for (String cityName1 : city){
                 if (cityName1.equals(cityName)){
                     found = true;
                     break;
                 }
             }

           } else{
                found = true;
                city.add(evfound.homeCity);

            }
          if(!found)
                city.add(evfound.homeCity);


//            System.out.println("Ev numarası: "+evfound.homeNo+"\n"+"Il: "+evfound.homeCity+" Ilçe: "+evfound.homeDistrict+
//                    " Kat Numarası: "+evfound.homeFloor+" Ev Toplam Alanı:" + evfound.homeSquare+" ");
        }//kaç il isimleri yazıyor seçmek için
        for (String cityName1 : city){
            System.out.println(cityName1+"\n");
        }

    }
}
