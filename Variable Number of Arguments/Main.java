public class Main {
    public static int add(int... numbers)
{
	int sum = 0;
	for (int number : numbers)
	{
		sum += number;
	}
	return sum;
}
    public static double add(double... numbers)
    {
        double sum = 0.0;
        for (double number : numbers)
        {	
            sum += number;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(add()); // Konsola 0 yazar
        System.out.println(add(2, 3)); // Konsola 5 yazar
        System.out.println(add(1, 5, 7)); // Konsola 13 yazar
        System.out.println(add(9)); // Konsola 9 yazar
        System.out.println(add(10, 15, 20, 25)); // Konsola 70 yazar

        System.out.println(add(5, 4, 3)); // Konsola 12 yazar
        System.out.println(add(9.0, 8.5, 8.0)); // Konsola 25.5 yazar
    }
}