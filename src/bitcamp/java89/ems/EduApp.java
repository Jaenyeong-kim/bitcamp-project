package bitcamp.java89.ems;
import java.util.Scanner;

public class EduApp {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // 여러 명의 학생 정보를 입력하기 위한 레퍼런스 배열 생성.
    ClassRoom[] classes = new ClassRoom[100];
    int length = 0;   // 레퍼런스 배열, 몇 명의 강의실 정보를 저장 했는지
                      // 몇 개의 강의실 정보가 들어 있는지


    // 반복해서 입력 받음
    while (length < classes.length) {
      ClassRoom c1 = new ClassRoom();
      System.out.println("강의실 이름을 입력하세요.");
      c1.className = scan.nextLine();

      System.out.println("강의실 층을 입력하세요.");
      c1.floorInfo = scan.nextLine();

      System.out.println("강의실 수용 인원을 입력하세요.");
      c1.capacity = Integer.parseInt(scan.nextLine());

      System.out.println("강의실 캐비닛 수를 입력하세요.");
      c1.cabinetQty = Integer.parseInt(scan.nextLine());

      System.out.println("강의실 에어컨 수를 입력하세요.");
      c1.airconditionerQty = Integer.parseInt(scan.nextLine());

      System.out.println("강의실 프로젝트 빔 여부 (Y/N)");
      c1.projectBim = scan.nextLine().equals("Y") ? true : false;

      classes[length++] = c1;

      System.out.println("계속 입력하시겠습니까?");
      if (!scan.nextLine().equals("y")) {
        break;
      }

    }
    printClassRoom(classes, length);
  }

  //    System.out.println("비트캠프 ㅎㅇㅎㅇ");
  //static void printClassRoom(ClassRoom[] classes, int length) {
  static void printClassRoom(ClassRoom[] classes, int length) {

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
}
