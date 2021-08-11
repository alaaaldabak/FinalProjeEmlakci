import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FinalProjesiEmlakci {
     static String userName="Alaa",password="123";
     static List<EvBilgileri> homeDetailes = new ArrayList<>() ;
     static List<EvBilgileri> selectHomeList = new ArrayList<>() ;
     static List<ClientHomeList> clientHome = new ArrayList<>();
     static EvBilgileri home = new EvBilgileri();

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
            System.out.println("Lütfen birini seçiniz:\n 1. Ev Ekleme \n 2. Ev Sorgulama \n  ");
            try {
                inputCheck = select.next();
                if (Integer.class.isInstance(Integer.parseInt(inputCheck))) {

                    if (inputCheck.equals("1") || inputCheck.equals("2") ) {
                        isNumberWrong = false;
                    } else {
                        System.out.println("Lütfen 1 yada 2  seçiniz!");
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
        //il seçmekten sonra bir ilçe seçmesi gerekıyorsa
        System.out.println("Lütfen bir İl seçeniz:");
        Scanner selectCity = new Scanner(System.in);
        String selectCity1 = selectCity.nextLine();

        for (EvBilgileri cityList : homeDetailes ){
            if(selectCity1.equals(cityList.homeCity)){
                System.out.println("Ev numarası: "+cityList.homeNo+"\n"+"Il: "+cityList.homeCity+"-- Ilçe: "+cityList.homeDistrict+
                   "-- Kat Numarası: "+cityList.homeFloor+"-- Ev Adressi: "+cityList.homeAdress +"-- Ev Toplam Alanı:" + cityList.homeSquare+"-- Ev yaşı: "+cityList.homeOld +"-- Ev odası: "+cityList.homeRooms );
                if (cityList.homeStatus == 0)
                    System.out.println("-- Ev Durumu : Kira\n");
                else
                    System.out.println("-- Ev Durumu : Satılık\n");
                addSelectHome(cityList);
            }
        }
        System.out.println("Lütfen bir ev seçip numarınızını yazınız!");
        try {

           int selectCityNo = selectCity.nextInt();
            boolean foundNo = false;
          //  if  (Integer.class.isInstance(Integer.parseInt(selectCityNo))) {
            for(EvBilgileri homeFound : selectHomeList){
                System.out.println(homeFound.homeNo);
                if( selectCityNo == homeFound.homeNo) {
                    int homeIndex = selectHomeList.indexOf(selectCityNo);
                  //  ClientHomeList clientHome = new ClientHomeList();
                  //  clientHome.add(new  EvBilgileri());
                     home = new EvBilgileri(homeFound.homeNo, homeFound.homeCity, homeFound.homeDistrict, homeFound.homeAdress, homeFound.homeSquare, homeFound.homePrice, homeFound.homeRooms, homeFound.homeFloor, homeFound.homeOld, homeFound.homeStatus);
                  //  System.out.println("index "+homeIndex);
                    foundNo = true;
                    break;
                }
            }
            if(foundNo){
                while (true) {
                    System.out.println("Bu ev almak veya tutmak için Lütfen gerek bilgilerinizi giriniz:\nTc Kimlik No: ");
                    Scanner inputClient = new Scanner(System.in);
                    String clientNo = inputClient.next();
                    System.out.println(Integer.class.isInstance(Integer.parseInt(clientNo)));
                    if (Integer.class.isInstance(Integer.parseInt(clientNo))) {
                        System.out.println("Ad Soyadı: ");
                        String clientNameSurname = inputClient.next();
                        System.out.println(clientNameSurname);
                        while(true) {
                            System.out.println("Telefon numarası: ");
                            float clientTelefon = inputClient.nextFloat();
//                            System.out.println(Integer.class.isInstance(Integer.parseInt(clientTelefon)));
//                            if (Integer.class.isInstance(Integer.parseInt(clientTelefon))) {
                                System.out.println("Mail Adressi: ");
                                String clientMail = inputClient.nextLine();
                                System.out.println("Ev/iş Adressi: ");
                                String clientAdress = inputClient.nextLine();
                                System.out.println("Onu kaydetmek için kabul ediyor musunuz?Evet yada Hayır");
                                String clientSure = inputClient.next();
                            System.out.println(clientSure);
//                                if ( !clientSure.equals("evet")&& !clientSure.equals("Evet")&& !clientSure.equals("hayır")&& !clientSure.equals("Hayır")){
//                                    System.out.println("Lütfen Evet yada Hayır giriniz!");
//                                }else{
                                    if(clientSure.equals("evet")|| clientSure.equals("Evet")){
                                        Clientİnformation client = new Clientİnformation(Integer.parseInt(clientNo),  clientNameSurname,  clientMail,  clientAdress,
                                               clientTelefon);
//                                        clientHome.add(new ClientHomeList(new EvBilgileri( home.homeNo, home.homeCity,home.homeDistrict, home.homeAdress, home.homeSquare,
//                                                home.homePrice, home.homeRooms, home.homeFloor, home.homeOld, home.homeStatus)),
//                                                new Clientİnformation(Integer.parseInt(clientNo),clientNameSurname,clientMail,clientAdress,Integer.parseInt( clientTelefon)));
                                            clientHome.add(new ClientHomeList(Integer.parseInt(clientNo),  clientNameSurname,  clientMail, clientAdress,  clientTelefon,
                                                    home.getHomeNo(), home.homeCity, home.homeDistrict, home.homeAdress, home.homeSquare, home.homePrice, home.homeRooms,
                                                    home.homeFloor, home.homeOld, home.homeStatus) );
                                        System.out.println("İşlemlerinizi tamamladı.");

                                    }else if (clientSure.equals("hayır")|| clientSure.equals("Hayır")) {
                                        System.out.println("İşlemlerinizi iptal edilmiştir!");
                                    } else{
                                        System.out.println("İşlemlerinizi tamamlayamadı. ");
                                    }


                                break;



                        }
                        break;

                    } else {
                        System.out.println("Lütfen doğru Tc giriniz!");
                    }

                }
            }else{
                System.out.println("Girdiğinz sayı doğru değildir.Lütfen listedekilerden birni seçiniz!");

            }

        }catch (Exception e) {
            System.out.println("Girdiğinz sayı doğru değildir.Lütfen listedekilerden birni seçiniz!");
        }




    }public static void addSelectHome(EvBilgileri homeList){
        selectHomeList.add( new EvBilgileri(homeList.homeNo,homeList.homeCity,homeList.homeDistrict,homeList.homeAdress,homeList.homeSquare,homeList.homePrice,homeList.homeRooms,
                homeList.homeFloor,homeList.homeOld, homeList.homeStatus));

    }

}
