public class Main {
    public static void main(String[] args) {
        String[] a={"Java","102","Patika","Dev"};
        Integer[] b={1,2,3,4};
        Integer[] c=new Integer[10];
        c[0]=1;
        Character[] c2={'J','A','V','a'};

        for(String i:a){
            System.out.println(i);
        }

        for(Integer i:b){
            System.out.println(i);
        }

        for(Character i:c2){
            System.out.println(i);
        }

        System.out.println("--------Generic--------");
        Print.printArray(a);
        Print.printArray(b);
        Print.printArray(c2);
    }
}