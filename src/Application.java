import app.Arithmetic;

/**
 * Created by 冯晓 on 2018/3/17.
 */
public class Application {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++){
            if (Arithmetic.generate()){
                System.out.println("SUCCESS");
            }
        }
    }
}