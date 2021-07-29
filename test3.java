public class test3 {
    int a;
    public void vartest(test3 test){
        test.a++;
        
    }
    public static void main(String[] args) {
        
        test3 myTest = new test3();
        myTest.a=1;
        myTest.vartest(myTest); 
      
        System.out.println(myTest.a);
    }
    
    

    
}
