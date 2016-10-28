package bitcamp.java89.ems;
import java.util.Scanner;

public class EduApp {

  // 여러 명의 학생 정보를 입력하기 위한 레퍼런스 배열 생성.
  static Scanner scan = new Scanner(System.in);
  //static ClassRoom[] classes = new ClassRoom[100];
  //static ClassRoom c1 = new ClassRoom();
  static String sss;
  static String s0;
  static int s1;
  static int s2;
  static int s3;
  static boolean s4;
  static String update;
  //static boolean working;
  static int length = 0;   // 레퍼런스 배열, 몇 명의 강의실 정보를 저장 했는지
                           // 몇 개의 강의실 정보가 들어 있는지

  public static void main(String[] args) {

    //ClassRoom[] classes = new ClassRoom[100];

    ClassControl ClassControl = new ClassControl(scan);
    //ClassControl.ClassRoom = c1;
    //ClassControl.classes = classes;
    work:
    while (true) {

      System.out.println("ADD, LIST, VIEW, UPDATE 입력");
      sss = scan.nextLine().toUpperCase();

      if (sss.equals("ADD")) {

        working :
        //while (length < classes.length) {
        while (true) {

          ClassControl.addClassRoom();
          System.out.println("계속 입력하시겠습니까?");

          if (!scan.nextLine().equals("Y")) {
            break working;
          }
        }
      }

      else if (sss.equals("LIST")) {
        ClassControl.printClassRoom();
      }

      else if (sss.equals("VIEW")) {
        sss = scan.nextLine().toUpperCase();
        ClassControl.findClassRoom(sss);
      }
      else if (sss.equals("UPDATE"))  {

        ClassControl.printClassRoom();
        System.out.println("원하는 강의실 이름을 입력하세요.");
        sss = scan.nextLine().toUpperCase();

        ClassControl.findClassRoom(sss);

        if (ClassControl.selectYn == false) {
          System.out.println("해당 강의실이 없습니다.");
          continue;
        }

        System.out.println("바꾸실 데이터를 입력해주세요.");
        System.out.println("층정보");
        s0 = scan.nextLine().toUpperCase();
        System.out.println("수용인원");
        s1 = Integer.parseInt(scan.nextLine());;
        System.out.println("캐비닛 수");
        s2 = Integer.parseInt(scan.nextLine());;
        System.out.println("에어컨 수");
        s3 = Integer.parseInt(scan.nextLine());;
        System.out.println("프로젝트 빔 여부");
        s4 = scan.nextLine().equals("Y") ? true : false;
        System.out.println("최종 저장 하시겠습니까?(Y/N)");
        update = scan.nextLine().toUpperCase();

        if (!update.equals("Y")) {
          System.out.println("저장이 취소되었습니다.");
          continue;
        } else {
          // 업데이트
          ClassControl.updateClassRoom(sss, s0, s1, s2, s3, s4);
        }
        System.out.println("결과를 확인하세요.");
        ClassControl.printClassRoom();
        continue;
      }

      else if (sss.equals("QUIT")) {
        System.out.println("안농.");
          break work;
      }

      else {
        System.out.print("ADD, VIEW, LIST 중 입력");
        sss = scan.nextLine().toUpperCase();
        continue;
      }
    }
  }

}
