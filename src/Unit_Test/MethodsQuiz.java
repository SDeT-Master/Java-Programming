package Unit_Test;

public class MethodsQuiz {
    public static void main(String[] args) {
        int num=5;

        while(isAvaiable(num)){


            System.out.println(--num);

        }




    }

    public  static boolean isAvaiable(int num){
        return (num-->0)? true:false;
    }
}
