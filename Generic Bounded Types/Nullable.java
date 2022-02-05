public class Nullable<T extends Number> { //**** T extends Number means, should be integer.
    private final T value;

    public Nullable(T value) {
        this.value = value;
    }

    public T getValue() { //Since it is defined as "final", the "setter" method is not written.
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
