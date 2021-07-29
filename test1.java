public class test1 {
    
    //입력값과 출력값 다 있는거
    public int sum(int a, int b){
        return a+b;
    }

     //출력값만 있는거 
     public String say() {
         return "hi";
    }
    // 입력값만 있는거
    public void sum2(int a,int b){
        System.out.println(a+" and "+b+"sum: "+(a+b));
    }
    // 둘다 없는거
    public void say2() {
        System.out.println("hi");
    }



    public static void main(String[] args) {
        // int a =3;
        // int b =4;

        Test myTest = new Test();
        // int c = myTest.sum(a,b); 1번 케이스
        // String a = myTest.say(); 2번 케이스
        myTest.sum2(3,4); //3번 케이스
       // System.out.println(a);
        myTest.say();
    
    }
}
