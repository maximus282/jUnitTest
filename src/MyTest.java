public class MyTest {

    public static void main(String[] args) {
        String a = "max";
        String b = "sara";
        MyTest myTest = new MyTest();
        System.out.println(myTest.concatenate(a,b));

    }




    public String concatenate(String one, String two){
        return one + two;
    }

    public int dodawanie(int a,int b){
        return a + b;
    }



}