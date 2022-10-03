interface boy{
    void height();
}

abstract class person{
    abstract void gender();
    abstract void country();
}

class human extends person implements boy{
    private static int a;
    public static void getInt(){
        System.out.println(a);
    }
    public static void setInt(int i){
        a = i;
    }
    void gender(){
        System.out.println("male");
    }
    void country(){
        System.out.println("India");
    }
    public void height(){
        System.out.println("print height");
    }
}


public class harsh{
    public static void main(String[] args){
        System.out.println("Hello World");
        human harsh = new human();
        harsh.gender();
        harsh.country();
        harsh.height();
        // System.out.println(a);//don't work as a is private
        human.setInt(7);
    }
}