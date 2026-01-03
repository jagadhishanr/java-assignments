public class StaticVsInstance {
    static int staticCount = 0;
    int instanceCount = 0;
    StaticVsInstance() {
        staticCount++;
        instanceCount++;
    }

    public void display() {
        System.out.println("Static Count: " + staticCount);
        System.out.println("Instance Count: " + instanceCount);
        System.out.println();
    }

    public static void main(String[] args) {

        StaticVsInstance obj1 = new StaticVsInstance();
        obj1.display();

        StaticVsInstance obj2 = new StaticVsInstance();
        obj2.display();
    }
}
