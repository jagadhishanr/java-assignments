public class salary {
    public static void main(String[] args) {
        double salary = 30000;

        System.out.println("Initial Salary: " + salary);
        salary += 5000;
        System.out.println("After += 5000: " + salary);
        salary -= 2000;
        System.out.println("After -= 2000: " + salary);
        salary *= 2;
        System.out.println("After *= 2: " + salary);
        salary /= 2;
        System.out.println("After /= 2: " + salary);
    }
}
