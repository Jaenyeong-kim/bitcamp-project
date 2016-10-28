package bitcamp.java89.ems;
import java.util.Scanner;

public class ClassControl {

  Scanner scan;
  int length = 0;
  ClassRoom[] classes = new ClassRoom[100];
  ClassRoom c1 = new ClassRoom();
  boolean selectYn = false;

  // 기본 생성자가 없다.
  // 생성자에서 하는 일은 그 객체를 사용하기 전에 유효 상태로 만드는 것이다.

  public ClassControl(Scanner scan) {
    this.scan = scan;
  }

  // 강의실 List 출력
  public void printClassRoom() {

    for (int j = 0; j < this.length; j++) {
      ClassRoom c1 = classes[j];
      System.out.printf("%s, %s, %s, %d, %d, %b\n",
       c1.className
      ,c1.floorInfo
      ,c1.capacity
      ,c1.cabinetQty
      ,c1.airconditionerQty
      ,c1.projectBim);
    }
  }

  // 강의실 정보 업데이트
  public void updateClassRoom(String sss, String s0, int s1, int s2, int s3, boolean s4) {
    for (int i = 0; i < this.length; i++) {
      ClassRoom c1 = classes[i];
      if (c1.className.equals(sss)) {
        c1.floorInfo = s0;
        c1.capacity = s1;
        c1.cabinetQty = s2;
        c1.airconditionerQty = s3;
        c1.projectBim = s4;
      }
    }
  }

  // 강의실 정보 등록
  public void addClassRoom() {
    ClassRoom c2 = new ClassRoom();

    System.out.println("강의실 이름을 입력하세요.");
    c2.className = this.scan.nextLine().toUpperCase();

    System.out.println("강의실 층을 입력하세요.");
    c2.floorInfo = this.scan.nextLine().toUpperCase();

    System.out.println("강의실 수용 인원을 입력하세요.");
    c2.capacity = Integer.parseInt(this.scan.nextLine());

    System.out.println("강의실 캐비닛 수를 입력하세요.");
    c2.cabinetQty = Integer.parseInt(this.scan.nextLine());

    System.out.println("강의실 에어컨 수를 입력하세요.");
    c2.airconditionerQty = Integer.parseInt(this.scan.nextLine());

    System.out.println("강의실 프로젝트 빔 여부 (Y/N)");
    c2.projectBim = this.scan.nextLine().equals("Y") ? true : false;

    classes[length++] = c2;
  }

  // 특정 강의실 찾기
  public void findClassRoom(String sss) {
    //findClassRoom(sss);

    for (int i = 0; i < this.length; i++) {
//      ClassRoom c1 = new ClassRoom();
      //c1 = classes[i];
      //System.out.println(sss);
      if (this.classes[i].className.equals(sss)) {
         System.out.printf("%s, %s, %s, %d, %d, %b\n"
        ,this.classes[i].className
        ,this.classes[i].floorInfo
        ,this.classes[i].capacity
        ,this.classes[i].cabinetQty
        ,this.classes[i].airconditionerQty
        ,this.classes[i].projectBim);
        selectYn = true;
      }
    }
  }


}
