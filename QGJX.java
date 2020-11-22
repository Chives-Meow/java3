package jiekou;
import java.util.Scanner;
public abstract class QGJX implements Student,Teacher{
	public static void main(String[] args) {
		System.out.println("——————学生入口———————");
		  Scanner in = new Scanner(System.in);
		  int banknumber;
		  int number;
		  System.out.print("请输入学号：");
		  number = in.nextInt();
		  System.out.println(number + "号学员，本学期你需要缴费:4500$");
		  if(true)
		  {
		  System.out.println("请输入银行卡号：");
		  banknumber = in.nextInt();
		  }
		  System.out.println(banknumber + "身份验证成功!");
	try {
        System.out.println("————————研究生一————————");
        Doctor stu = new Doctor();
        stu.setName("xxx");
        stu.setAge(20);
        stu.setNumber(2019666888);
        stu.setSex("男");
        stu.setTuition(8000);
        stu.setSalary(1200);
        System.out.println("学生姓名:" + stu.getName());
        System.out.println("学生年龄:" + stu.getAge());
        System.out.println("学生编号:" + stu.getNumber());
        System.out.println("学生性别:" + stu.getSex());
        stu.find_tuition();
        stu.find_salary();
        stu.taxation();
        System.out.println("————————研究生二————————");
        Doctor stu_1 = new Doctor();
        stu_1.setName("yyy");
        stu_1.setAge(20);
        stu_1.setNumber(2019666999);
        stu_1.setSex("女");
        stu_1.setTuition(8000);
        stu_1.setSalary(1185);
        System.out.println("学生姓名:" + stu_1.getName());
        System.out.println("学生年龄:" + stu_1.getAge());
        System.out.println("学生编号:" + stu_1.getNumber());
        System.out.println("学生性别:" + stu_1.getSex());
        stu_1.find_tuition();
        stu_1.find_salary();
        stu_1.taxation();
    } catch (Exception e) {
        System.out.println("数据异常");
    }

}

interface Manger_student {
    double find_tuition();

    double afford_tuition();
}

interface Manger_teacher {
    double STANDARD = 0.2;

    double find_salary();

    double get_salary();
}


public static class Doctor implements Manger_student, Manger_teacher {
    public Doctor() {

    }

    public Doctor(String name, int age, int number, String sex, double tuition, double salary) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.sex = sex;
        this.tuition = tuition;
        this.salary = salary;
    }

    private String name;
    private int age;
    private int number;
    private String sex;
    private double tuition;
    private double salary;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public double getTuition() {
        return tuition;
    }

    public int getNumber() {
        return number;
    }

    public double getSalary() {
        return salary;
    }


    public double find_tuition() {
        System.out.println("每年学费：" + tuition);
        return tuition;
    }

    public double find_salary() {
        System.out.println("每月工资：" + salary);
        return salary;
    }

    public double afford_tuition() {
        return tuition;
    }

    public double get_salary() {
        double c;
        c = salary - (salary - 800) * STANDARD;

        return salary;
    }

    public void taxation() {
        double a;
        a = 12 * ((salary - 800) * STANDARD);
        System.out.println("每年应纳税为：" + a);
    }
}
}

