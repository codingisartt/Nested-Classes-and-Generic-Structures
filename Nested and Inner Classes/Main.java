public class Main {
    public static void main(String[] args) {
        
        Out o=new Out();
        o.run();

        //First way
        //Out.In inObject=o.new In(); 
        //inObject.run();
        
        Out.In inObject=o.getIn();
        inObject.run();

        System.out.println("------------------");

        Local l=new Local();
        l.run();

        System.out.println("------------------");
        //Anonymus a=new Anonymus();
        Anonymus a=new Anonymus(){ // ******** for object
            @Override
            public void run(){
                System.out.println("Anonymously written run method");
                print();// if we do not write there, we can not call with an object etc. 
            }
            public void print(){
                System.out.println("Print method");
            }
        };
        a.run();
    }
}
