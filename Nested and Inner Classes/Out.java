
public class Out {

    public int a=5;
    
    //If these classes are static, we do not create their objects. "Out.In.run();" works
    public class In{ // Iw we do "static" this, no need Out class.
        public int a=10;
        //System.out.println(a);
        
        public void run(){
            System.out.println("Run method who has In class");
            int a=1;
            System.out.println(a);
            System.out.println(this.a);// a from class
            System.out.println(Out.this.a); //different usage**
            
        }  // if we want to use "this" keyword, should be generate an object.
    }
    public void run(){
        In in=new In();
        in.run();
    }

    public In getIn(){//second way
        /*In in=new In();
        return in; 
        */

        return new In(); //has referrence in main class
    }
}