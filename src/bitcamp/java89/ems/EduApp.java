package bitcamp.java89.ems;
import java.util.Scanner;

public class EduApp {

  // 여러 명의 학생 정보를 입력하기 위한 레퍼런스 배열 생성.

  static Scanner scan = new Scanner(System.in);
  //static ClassRoom[] classes = new ClassRoom[100];
  //static ClassRoom c1 = new ClassRoom();

  //static boolean working;
  static int length = 0;   // 레퍼런스 배열, 몇 명의 강의실 정보를 저장 했는지
                           // 몇 개의 강의실 정보가 들어 있는지

  public static void main(String[] args) {
    String sss;

    //ClassRoom[] classes = new ClassRoom[100];

    ClassControl ClassControl = new ClassControl(scan);

    while (true) {
      System.out.println("menu, GO 입력");
      sss = scan.nextLine().toUpperCase();

      switch (sss) {
      case "MENU" : menuClassRoom(); break;
      case "GO" : ClassControl.service(); break;
      default :
      break;
      }
    }

  }

    static void menuClassRoom() {
      System.out.println("메뉴");
      System.out.println("강의실 관리");
      System.out.println("메뉴 이동은 go 강의실 관리");
    }

}
