import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入登录名称：");
            String loginName = sc.next();
            System.out.println("请输入密码：");
            String passWord = sc.next();

            boolean rs = login(loginName, passWord);
            if(rs == true){
                System.out.println("登录成功");
                break;
            }
            else{
                System.out.println("登录失败");
            }
        }
    }
    /**
       接受账号和密码，返回认证结果。
     */
    public static boolean login(String loginName, String passWord){
        String okLoginName = "D5error";
        String okPassWord = "1234";

        return okLoginName.equals(loginName) && okPassWord.equals(passWord);
    }
}