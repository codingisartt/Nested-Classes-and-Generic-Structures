public class Nullable {
    private final String value;

    public Nullable(String value) {
        this.value = value;
    }

    public String getValue() { //Since it is defined as "final", the "setter" method is not written.
        return value;
    }

    public boolean isNull(){
        return this.getValue()==null; //true
    }

    public void run(){
        if(isNull()){
            System.out.println("Bu değişkene değer atanmamıştır (null)");
        }else
            System.out.println(this.getValue());
    }
}
