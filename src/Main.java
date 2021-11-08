import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    SchoolManager schoolManager = new SchoolManager();
    StudentManager studentManager = new StudentManager();
    Scanner input = new Scanner(System.in);
    
    System.out.println("MERHABA");
    System.out.println("Ne eklemek istersiniz ?");
    System.out.println(" 1 = Okul ekle \n 2 = Öğrenci Ekle"); 
    
    
    int chose = input.nextInt();
    schoolManager.add();
    System.out.println("Öğrenci ekle");
    studentManager.add();
    
    input.close();
    switch (chose) {

    case 1:
      System.out.println("okul ekle"); 
      break;
      
    
    case 2:
    System.out.println("öğrenci ekle"); 
    break;

    }
  }

}
