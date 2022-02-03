public class Main {

    public static void main(String[] args) {
        Integer a=50;
        String str=a.toString();
        System.out.println(str);

        String s="10";
        int c=Integer.parseInt(s);
        String b="20";
        System.out.println(s+b);//concanitation

        System.out.println(Integer.max(100, 60));

        System.out.println("--------------------");

        int i=36;
        // Autoboxing
        Integer j=i; // Integer.valueOf(a)

        // Boxing
        Integer k=Integer.valueOf(i);

        // AutoUnboxing
        int m=k; // k.intValue()

        // Unboxing
        int n=k.intValue();

        System.out.println(m);

    }
}