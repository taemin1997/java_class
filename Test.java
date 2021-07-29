
public class Test {
   
  public int sum(int a, int b){
    return a+b;  
}
    

    public String say(){  //입력값 없는 메서드
        return "hi";  //이 메서드론 무조건 hi만 출력
    }
    public void sum2(int a, int b){
        System.out.println(a+"과 "+b+"의 합은 "+ (a+b)+"입니다.");
    }

public static void main(String[] args) { //시작점 자바는 항상 main에서 시작
int a = 3;
int b = 4;

Test myTest = new Test();

myTest.sum2(a,b);



}

}