public class VariableTypesExample {
    static int staticVar = 100;
    int instanceVar = 50;
    void display() {
        int localVar = 25;
        System.out.println(localVar);
        System.out.println(instanceVar);
        System.out.println(staticVar);
    }
    public static void main(String[] args) {
        VariableTypesExample obj = new VariableTypesExample();
        obj.display();
    }
}
