/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author Nam Nguyen
 */
public class Students {
    
    private int id;
    private String name;
    private String birthday;
    private String email;
    private String number;
    
    
    public Students(int id, String name, String birthday, String email, String number){
        this.id= id;
        this.name= name;
        this.birthday= birthday;
        this.email= email;
        this.number= number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public void Show(){
        System.out.println("ID: "+ this.id);
        System.out.println("Tên sinh viên: "+ this.name);
        System.out.println("Ngày tháng năm sinh: "+this.birthday);
        System.out.println("Email: "+ this.email);
        System.out.println("Số điện thoại: "+ this.number);
    }  
}
