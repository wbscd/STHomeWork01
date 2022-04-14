package com.company;

import java.util.*;

public class StudentManager {
    List<Student> list = new ArrayList();
    Scanner in = new Scanner(System.in);
    public void showMenu(){
        System.out.println("请选择操作：");
        System.out.println("*******************");
        System.out.println("*      1.插入      *");
        System.out.println("*      2.查找      *");
        System.out.println("*      3.删除      *");
        System.out.println("*      4.修改      *");
        System.out.println("*      5.输出      *");
        System.out.println("*      6.退出      *");
        System.out.println("*******************");
    }

    public void App() {
        while(true) {
            showMenu();
            int op = in.nextInt();
            in.nextLine();
            if (op == 1) {
                insertStudent();
            } else if (op == 2) {
                findStudents();
            } else if (op == 3) {
                deleteStudent();
            } else if (op == 4) {
                modifyStudent();
            } else if (op == 5) {
                showStudents();
            } else if (op == 6) {
                return;
            }
        }
    }

    private void insertStudent(){
        System.out.print("请输入学生姓名：");
        String name = in.nextLine();
        System.out.print("请输入学生学号：");
        int id = in.nextInt();
        in.nextLine();
        System.out.print("请输入学生出生日期(格式为yyyy-mm-dd)：");
        String birthday = in.nextLine();
        System.out.print("请输入学生性别(0为女,1为男)：");
        int gender = in.nextInt();
        in.nextLine();
        Student student = new Student(name, id, birthday, gender==1);
        list.add(student);
    }

    private void deleteStudent() {
        System.out.print("请输入学生姓名：");
        String name = in.nextLine();

        for(Student student : list){
            if(student.getName().equals(name)) {
                list.remove(student);
                return;
            }
        }
    }


    private void modifyStudent() {
        System.out.print("请输入学生姓名：");
        String name = in.nextLine();

        for(Student student : list){
            if(student.getName().equals(name)){
                System.out.print("请输入学生学号：");
                int id = in.nextInt();
                in.nextLine();
                System.out.print("请输入学生出生日期(格式为yyyy-mm-dd)：");
                String birthday = in.nextLine();
                System.out.print("请输入学生性别(0为女,1为男)：");
                boolean gender = in.nextBoolean();
                in.nextLine();
                student.setBirthday(birthday);
                student.setGender(gender);
                student.setId(id);
                return;
            }
        }
    }


    private void findStudents() {
        System.out.print("请输入学生姓名：");
        String name = in.nextLine();

        for(Student student : list){
            if(student.getName().equals(name)){
                System.out.println("姓名:"+student.getName()+" , 学号:"+student.getId()+" , 性别:"+(student.isGender()?"男":"女")+" , 出生日期:"+student.getBirthday());
                return;
            }
        }
    }

    private void showStudents() {
        Collections.sort(list,new cmp());
        for(Student student : list){
            System.out.println("姓名:"+student.getName()+" , 学号:"+student.getId()+" , 性别:"+(student.isGender()?"男":"女")+" , 出生日期:"+student.getBirthday());
        }
    }
}
