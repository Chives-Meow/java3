# java3
接口程序实验

##实验目的##
……………………………………
掌握Java中抽象类和抽象方法的定义； 
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
了解异常的使用方法，并在程序中根据输入情况做异常处理
……………………………………
##实验过程##
……………………………………
首先模拟学生信息入口，验证学生信息
System.out.println("——————学生入口———————");
Scanner in = new Scanner(System.in);
![image]java3/1.png at main · Chives-Meow/java3 (github.com)
分别从学号信息，银行卡信息验证学生身份
System.out.print("请输入学号：");
		  number = in.nextInt();
System.out.println("请输入银行卡号：");
		  banknumber = in.nextInt();
![image]https://github.com/Chives-Meow/java3/blob/main/2.png
使用try语句，将两个研究生的信息编写
catch语句防止报错
定义学生和老师类接口
interface Manger_student {
interface Manger_teacher {
最后将各个数据进行赋值，结合查到的纳税算法，将学生纳税额算出
工资个税的计算公式为:应纳税额=(工资薪金所得 -“五险一金”-扣除数)×适用税率-速算扣除数。个税起征点是5000，使用超额累进税率的计算方法如下：
缴税=全月应纳税所得额*税率-速算扣除数
实发工资=应发工资-五金-缴税
全月应纳税所得额=(应发工资-四金)-5000
……………………………………
##实验结果##
![image]https://github.com/Chives-Meow/java3/blob/main/3.png
