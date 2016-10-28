package bitcamp.java89.ems;
import java.util.Scanner;

public class EduApp {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("비트캠프 ㅎㅇㅎㅇ");

    ClassRoom classOne = new ClassRoom("Java&DB강의실", "3층", 27, 12, 4, true);
    ClassRoom classTwo = new ClassRoom();

    System.out.println(classOne.className);
    System.out.println(classOne.floorInfo);
    System.out.println(classOne.capacity);
    System.out.println(classOne.cabinetQty);
    System.out.println(classOne.airconditionerQty);
    System.out.println(classOne.projectBim);

    System.out.println("강의실 이름을 입력하세요.");
    classTwo.className = scan.nextLine();

    System.out.println("강의실 층을 입력하세요.");
    classTwo.floorInfo = scan.nextLine();

    System.out.println("강의실 수용 인원을 입력하세요.");
    classTwo.capacity = Integer.parseInt(scan.nextLine());

    System.out.println("강의실 캐비닛 수를 입력하세요.");
    classTwo.cabinetQty = Integer.parseInt(scan.nextLine());

    System.out.println("강의실 에어컨 수를 입력하세요.");
    classTwo.airconditionerQty = Integer.parseInt(scan.nextLine());

    System.out.println("강의실 프로젝트 빔 여부 (Y/N)");
    classTwo.projectBim = scan.nextLine().equals("Y") ? true : false;

    System.out.println(classTwo.className);
    System.out.println(classTwo.floorInfo);
    System.out.println(classTwo.capacity);
    System.out.println(classTwo.cabinetQty);
    System.out.println(classTwo.airconditionerQty);
    System.out.println(classTwo.projectBim);

    // String className;
    // String floorInfo;
    // int capacity;
    // int cabinetQty;
    // int airconditionerQty;
    // boolean projectBim;
  }
}
