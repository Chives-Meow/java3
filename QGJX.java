package jiekou;
import java.util.Scanner;
public abstract class QGJX implements Student,Teacher{
	public static void main(String[] args) {
		System.out.println("������������ѧ����ڡ�������������");
		  Scanner in = new Scanner(System.in);
		  int banknumber;
		  int number;
		  System.out.print("������ѧ�ţ�");
		  number = in.nextInt();
		  System.out.println(number + "��ѧԱ����ѧ������Ҫ�ɷ�:4500$");
		  if(true)
		  {
		  System.out.println("���������п��ţ�");
		  banknumber = in.nextInt();
		  }
		  System.out.println(banknumber + "�����֤�ɹ�!");
	try {
        System.out.println("�����������������о���һ����������������");
        Doctor stu = new Doctor();
        stu.setName("xxx");
        stu.setAge(20);
        stu.setNumber(2019666888);
        stu.setSex("��");
        stu.setTuition(8000);
        stu.setSalary(1200);
        System.out.println("ѧ������:" + stu.getName());
        System.out.println("ѧ������:" + stu.getAge());
        System.out.println("ѧ�����:" + stu.getNumber());
        System.out.println("ѧ���Ա�:" + stu.getSex());
        stu.find_tuition();
        stu.find_salary();
        stu.taxation();
        System.out.println("�����������������о���������������������");
        Doctor stu_1 = new Doctor();
        stu_1.setName("yyy");
        stu_1.setAge(20);
        stu_1.setNumber(2019666999);
        stu_1.setSex("Ů");
        stu_1.setTuition(8000);
        stu_1.setSalary(1185);
        System.out.println("ѧ������:" + stu_1.getName());
        System.out.println("ѧ������:" + stu_1.getAge());
        System.out.println("ѧ�����:" + stu_1.getNumber());
        System.out.println("ѧ���Ա�:" + stu_1.getSex());
        stu_1.find_tuition();
        stu_1.find_salary();
        stu_1.taxation();
    } catch (Exception e) {
        System.out.println("�����쳣");
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
        System.out.println("ÿ��ѧ�ѣ�" + tuition);
        return tuition;
    }

    public double find_salary() {
        System.out.println("ÿ�¹��ʣ�" + salary);
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
        System.out.println("ÿ��Ӧ��˰Ϊ��" + a);
    }
}
}

