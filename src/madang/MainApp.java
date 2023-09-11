package madang;

import java.sql.Connection;
import java.util.Scanner;

public class MainApp {
  static Connection conn = DBConn.makeConnection();
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int menu =0;
    if(conn != null) {
      while(true){
        menu = in.nextInt();
        if(menu < 0){
          System.out.println("프로그램을 종료합니다.");
          break;
        }
        switch (menu){
          case 1:
            bookList();
            break;
          case 2:
            customerList();
            break;
          case 3:
            orderList();
            break;
        }
      }
    }
  }

  static void bookList(){

  }

  static void customerList(){

  }

  static void orderList(){

  }
}