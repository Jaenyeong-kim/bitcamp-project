package bitcamp.java89.ems;
import java.util.Scanner;

public class EduApp {

  // 여러 명의 학생 정보를 입력하기 위한 레퍼런스 배열 생성.
  static Scanner scan = new Scanner(System.in);
  static ClassRoom[] classes = new ClassRoom[100];
  static ClassRoom c1 = new ClassRoom();
  static String sss;
  //static boolean working;
  static int length = 0;   // 레퍼런스 배열, 몇 명의 강의실 정보를 저장 했는지
                           // 몇 개의 강의실 정보가 들어 있는지

  public static void main(String[] args) {

    work:
    while (true) {

      System.out.println("ADD, LIST, VIEW 입력");
      sss = scan.nextLine().toUpperCase();

      if (sss.equals("ADD")) {

        working :
        while (length < classes.length) {

          addClassRoom();
          System.out.println("계속 입력하시겠습니까?");

          if (!scan.nextLine().equals("Y")) {
            break working;
          }
        }
      } else if (sss.equals("LIST")) {
        printClassRoom();
      } else if (sss.equals("VIEW")) {
        sss = scan.nextLine().toUpperCase();
        findClassRoom();
      } else if (sss.equals("QUIT")) {
          break work;
      } else {
        System.out.print("ADD, VIEW, LIST 중 입력");
        sss = scan.nextLine().toUpperCase();
        continue;
      }
    }
  }

  // 학생 정보 등록
  static void addClassRoom() {

    System.out.println("강의실 이름을 입력하세요.");
    c1.className = scan.nextLine().toUpperCase();

    System.out.println("강의실 층을 입력하세요.");
    c1.floorInfo = scan.nextLine().toUpperCase();

    System.out.println("강의실 수용 인원을 입력하세요.");
    c1.capacity = Integer.parseInt(scan.nextLine());

    System.out.println("강의실 캐비닛 수를 입력하세요.");
    c1.cabinetQty = Integer.parseInt(scan.nextLine());

    System.out.println("강의실 에어컨 수를 입력하세요.");
    c1.airconditionerQty = Integer.parseInt(scan.nextLine());

    System.out.println("강의실 프로젝트 빔 여부 (Y/N)");
    c1.projectBim = scan.nextLine().equals("Y") ? true : false;

    classes[length++] = c1;
  }

  // 강의실 List 출력
  public static void printClassRoom() {

    for (int i = 0; i < length; i++) {
      ClassRoom c1 = classes[i];
      System.out.printf("%s, %s, %s, %d, %d, %b\n",
       c1.className
      ,c1.floorInfo
      ,c1.capacity
      ,c1.cabinetQty
      ,c1.airconditionerQty
      ,c1.projectBim);
    }
  }

  // 특정 강의실 찾기
  public static void findClassRoom() {

    for (int i = 0; i < length; i++) {
      ClassRoom c1 = new ClassRoom();
      c1 = classes[i];
      if (c1.className.equals(sss)) {
        System.out.printf("%s, %s, %s, %d, %d, %b\n",
         c1.className
        ,c1.floorInfo
        ,c1.capacity
        ,c1.cabinetQty
        ,c1.airconditionerQty
        ,c1.projectBim);
      }
    }
  }

}
