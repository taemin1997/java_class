public class Dog extends Animal{

    public Dog() {                       //default 생성자
      
    }

    public void sleep(){
        System.out.println(this.name+" zzz");
    }

}





//setName이 없지만 Animal 클래스에서 상속받았기에 사용가능.
//부모 클래스보다 자식 클래스가 더 많은 기능을 가짐/