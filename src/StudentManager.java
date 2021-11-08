import java.util.Scanner;

public class StudentManager implements BaseManager {

    public static Scanner input = new Scanner(System.in);
    public static Student student = new Student();
    private String nextLine;
    
    // {   ArrayList<String> student = new ArrayList<String>();
    //     School.add("name");
    //     School.add("surname");
    //     School.add("age");
    //     School.add("nummer");
    //     System.out.println("ArrayList: " + student); }

    @Override
    public void add() {
        //İSMİNİ,SOY İSMİNİ,YAŞINI VE OKUL NUMARASINI ALAN BİR YAPILANDIRICI.
        System.out.println("İsim yazınız");
        student.setName(input.nextLine());
        System.out.println("Soy İsiminizi yazınız");
        student.setSurname(input.nextLine());
        System.out.println("Yaşınızı yazınız");
        nextLine = input.nextLine();
        student.setAge(nextLine);
        System.out.println("Okul numaranızı yazınız");
        student.setNumber(input.nextLine());
        System.out.println("Öğrenci eklendi.");
        System.out.println(student);
        
        
        for(int i=0; i<5; i++) {
        System.out.println("Adı : " + student.getName() + ", Soyadı : " + student.getSurname() + ", Yaşı : " + student.getAge()+ ", Okul Numarası: " + student.getNumber());
        }
     }
        
    
    @Override
    public void delete() {
        //ÖĞRENCİ NUMARASI İLE ÖĞRENCİ SİLME İŞLEMİ YAPAN YAPILANDIRICI.
        //System.out.println("Silmek istediğiniz öğrencinin okul numarasını yazınız.");
        //System.out.println("Öğrenci Silindi!");
    
    }
    
    
    @Override
    public void update() {
        //ÖĞRENCİ NUMARASI İLE GÜNCELLEME YAPAN YAPILANDIRMA.
        //System.out.println("Güncellenecek öğrencinin okul numarasını yazınız."); 
    
    }
    
    
    @Override
    public void getList() {
        //ANA MENÜYE DÖNMEK İÇİN ANAHTAR KELİME YAPILANIDRMASI.
        //System.out.println("Ana menüye dönmek için ('DÖN') yazın.");
    
    }

}
