public class test2 {
    public int vartest(int a){
        a++;
        return a;
    }
    public static void main(String[] args) {
        int a = 1;
        test2 myTest = new test2();
        a = myTest.vartest(a);
        System.out.println(a);
    }
    
}
