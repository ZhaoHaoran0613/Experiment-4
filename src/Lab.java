public class Lab {
    static double great = 20; //优的补助价格
    static double good = Math.ceil(great*0.75); //良的补助价格
    static double pass = Math.ceil(great*0.5); //及格的补助价格
    private String name;
    private int room;
    private int[] score = new int[18];
    public Lab(String name,int room){  //使用默认的补助价格
        this.name = name;
        this.room = room;
    }
    public Lab(double buzhu,String name,int room){ //自定义补助价格
        this.great = buzhu;
        this.name = name;
        this.room = room;
    }
    public void setscore(int[] a){ this.score = a; }
    public String getName() {
        return name;
    }
    public int[] getScore(){
        return score;
    }

}
