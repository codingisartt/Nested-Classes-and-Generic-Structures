public class Local {
    public void run(){// we created a class in a method!!
        // Local Classes
        class Yerel{
            private int a;
            Yerel(int a){
               this.a=a; 
            }
         
            public int getA() {
                return a;
            }

            public void setA (int a) {
                this.a = a;
            }
        }
        Yerel y=new Yerel(15);
        System.out.println("Local class worked.");
        System.out.println(y.getA());

    }


    

}
