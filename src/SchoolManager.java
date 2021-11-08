import java.util.Scanner;

public class SchoolManager implements BaseManager {

    public static Scanner input = new Scanner(System.in);
    public static School school = new School();


    @Override
    public void add() {
        System.out.println("Okulun adını giriniz.");
        school.setName(input.nextLine());
        System.out.println("Okulun kodunu giriniz.");
        school.setCode(input.nextLine());
        System.out.println("Okul aktif mi? aktif ise 'true' aktif değil ise 'false'yazınız.");
        school.setActive(input.nextBoolean());
        System.out.println("Okul ekleme işlemi tamamlandı.");
        System.out.println("Okul Listesi :");;

        for(int i=0; i<5; i++) {
            System.out.println("Adı : " + school.getName() + ", Kodu : " + school.getCode() + ", Aktif mi : " + school.getActive());
        }
    }

    
     //private void okulaktifmi() {
      
     //String onActive;
     //switch (onActive) {
     //case  "evet" : { 
     //school.setActive(true);
     //System.out.println(school.onActive()); }
       
    //case "hayır" : {
        //school.setActive(false);
        //System.out.println(school.onActive()); } } } 



    @Override
    public void delete() {
        // System.out.println("Silmek istediğiniz okulun adını giriniz.");
        // System.out.println("Okul Silindi!");
    }

    @Override
    public void update() {

        // System.out.println("!");

    }

    @Override
    public void getList() {

        // System.out.println("!");
    }

    public void add(String string) {
    }

    // @Override
    // public void delete() {
    // System.out.println("Silmek istediğiniz okulun adını yazınız.");
    // System.out.println("Okul Silindi!");
    // }

    // @Override
    // public void update() {
    // System.out.println("Okulun adını giriniz. ");
    // System.out.println("Okul güncelleme işlemi tamamlandı.");
    // System.out.println("Okul başarıyla güncellendi.");
    // }

    // @Override
    // public void list() {
    // System.out.println("Ana menüye dönmek için ('DÖN') yazın.");

    // }
}
