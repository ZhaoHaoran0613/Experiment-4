public class Testing {

    public static void main(String args[]) throws Exception{
        //实例化一堆实验室
        Lab[] labs = new Lab[5];
        Lab lab1 = new Lab("计算机网络实验室",801);
        labs[0] = lab1;
        Lab lab2 = new Lab("组成原理实验室",807);
        labs[1] = lab2;
        Lab lab3 = new Lab("大学生创新实验室",707);
        labs[2] = lab3;

        //实例化学生
        Student stu1 = new Student("张",001);
        Student stu2 = new Student("李",002);

        //给学生分配实验室
        stu1.add_lab(lab1);
        stu2.add_lab(lab2);
        stu2.add_lab(lab3);

        //默认评分
        int[] a= {8,8,8,7,7,6,10,8,5,8,9,7,9,5,7,7,7,8};
        int[] b= {5,8,7,9,8,8,7,3,9,9,9,9,9,10,6,5,8,7};
        int[] c= {5,8,7,9,8,8,7,9,7,7,9,8,8,5,6,5,7,8};
        lab1.setscore(a);
        lab2.setscore(b);
        lab3.setscore(c);

        //算钱,算税后
        stu1.cal_money();
        stu1.shuihou();
        stu2.cal_money();
        stu2.shuihou();







    }
}
