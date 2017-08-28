/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nam Nguyen
 */
public class Lab {

    private static ArrayList<Students> listStudents;

    /**
     * @param args the command line arguments
     */
    static void ShowInfoStudents(int ID) {

        Students st01 = listStudents.get(ID);

        st01.Show();
    }

    public static void EditInfoStudent(String content, int ID, int type) {
        Students student = listStudents.get(ID);
        switch (type) {
            case 1:
                student.setName(content);
                break;
            case 2:
                student.setBirthday(content);
                break;
            case 3:
                student.setEmail(content);
                break;
            case 4:
                student.setNumber(content);
        }
    }

    public static void AddStudent() {
        System.out.println("Nhập thông tin sinh viên: ");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Tên sinh viên: ");
        String name = sc2.nextLine();

        System.out.print("Ngày tháng năm sinh: ");
        String birthday = sc2.nextLine();

        System.out.print("Email: ");
        String email = sc2.nextLine();

        System.out.print("Số điện thoai: ");
        String number = sc2.nextLine();
        
        Students st = new Students(id, name, birthday, email, number);
        listStudents.add(st);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Students st01 = new Students(1, "Nguyễn Duy Nam", "03/08/1995", "namnd@fpt.edu.vn", "01626180455");
        Students st02 = new Students(2, "Nguyễn Bá Danh", "04/08/1995", "danhnb@fpt.edu.vn", "01626180155");
        Students st03 = new Students(3, "Trần Đức Đông", "05/08/1995", "dongtd@fpt.edu.vn", "01626180355");
        Students st04 = new Students(4, "Vũ Văn Linh", "06/08/1995", "linhvv@fpt.edu.vn", "01626180255");
        Students st05 = new Students(5, "Nguyễn Đăng Khánh", "07/08/1995", "khanhnd@fpt.edu.vn", "01626180055");

        listStudents = new ArrayList<>();
        listStudents.add(st01);
        listStudents.add(st02);
        listStudents.add(st03);
        listStudents.add(st04);
        listStudents.add(st05);

        boolean checkContinue = true;
        String checkOption;

        while (checkContinue) {
            System.out.println("----------------Danh sách sinh viên--------------------");
            int count = 1;
            for (Students x : listStudents) {
                System.out.println(count + "." + "ID: " + x.getId() + " Tên: " + x.getName());
                count++;
            }

            System.out.println("Xem thông tin sinh viên (Nhập 1)----Thêm sinh viên vào danh sách (Nhập 2)");
            Scanner option = new Scanner(System.in);
            int op = option.nextInt();

            if (op == 1) {
                System.out.println("Nhập ID để xem chi tiết sinh viên:");
                Scanner scan = new Scanner(System.in);
                int scanner = scan.nextInt();

                if (scanner - 1 < listStudents.size() && scanner > 0) {
                    ShowInfoStudents(scanner - 1);
                    System.out.println("Sửa thông tin sinh viên (Nhập 1)----Xóa thông tin sinh viên (Nhập 2)");

                    int check = scan.nextInt();
                    if (check == 1) {
                        // sua phan tu thu i
                        scan.reset();
                        System.out.println("Chọn thông tin cần sửa: 1.Tên sinh viên \n 2.Ngày tháng năm sinh \n 3.Email \n 4.Số điện thoại");
                        int select = scan.nextInt();
                        System.out.println("Nhập vào nội dung cần sửa!");
                        Scanner scan2 = new Scanner(System.in);
                        checkOption = scan2.nextLine();
                        // ham sua 
                        EditInfoStudent(checkOption, scanner - 1, select);
                    }
                    if (check == 2) {
                        listStudents.remove(scanner - 1);

                    }
                } else {
                    System.out.println("Vui lòng nhập đúng ID để xem được thông tin sinh viên!");
                }
            }
            if (op == 2) {
                AddStudent();
            }
        }
    }
}
