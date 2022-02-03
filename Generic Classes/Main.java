public class Main {
    public static void main(String[] args) {
        //Objects can be null, empty or undefined
        String s; //undefined. There is no registration area

        String s1=null; //There is just registration area but no value.

        String s2=""; // Empty. Full but empty :)

        String str="1213454";
        Nullable n=new Nullable(str);
        n.run();

        Integer i=null;
        NullableInteger n2=new NullableInteger(i);
        n2.run();

        System.out.println("---------Generic---------");
        Nullable2 <Integer> gnrc=new Nullable2<>(10);//we can not us primitive :)
        gnrc.run();
    
        Integer a1=10;
        String p="patika";
        Double pi=3.14;
        String s3="dev";
        Test<Integer,String,Double> t=new Test<>(a1, p, pi);
        t.showInfo();
        
        t.setObj2(s3); // we should "dev"
    }
}