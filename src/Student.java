public class Student {
    private String name;
    private int id;
    private double money;
    private int i;
    private Lab[] labs = new Lab[5];


    public Student(String name,int id){
        this.name = name;
        this.id = id;
    }

    //给学生添加实验室
    public void add_lab(Lab lab){
        labs[i] = lab;
        i++;
    }

    //计算全部所得钱数
    public void cal_money(){
        int[] a = new int[18];
        System.out.println(this.name + "的收入统计");
        System.out.print("打扫实验室：");
        for (int i = 0;i< labs.length;i++){

            if (labs[i] == null){
                continue;
            }
            else {
                System.out.print(labs[i].getName() +"   ");
                a = labs[i].getScore(); //实验室打分数组
                for(int j=0;j<18;j++){

                    if(a[j]>0 & a[j]<=5){ //5分一下及格
                        money = money + Lab.pass;
                    }
                    else if(a[j]>7 & a[j]<=10){ //7分以上优秀
                        money = money + Lab.great;
                    }
                    else if(a[j]>5 & a[j]<=7){  //其余良好
                        money = money + Lab.good;
                    }
                }
            }
        }
        System.out.println("\n"+this.name + "的总共收入" + money);
    }

    //算税收
    public void shuihou(){
        if(money<=200){
            System.out.println(this.name + "的税后所得为"+ Math.round(money*(1- Sl.taxmin)));
        }
        else if(money>200 & money<=400){
            System.out.println(this.name + "的税后所得为"+ Math.round(money*(1- Sl.tax)));
        }
        else if(money>400){
            System.out.println(this.name + "的税后所得为"+ Math.round(money*(1- Sl.taxmax)));
        }
    }
}
