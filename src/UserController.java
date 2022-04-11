public class UserController {
    public String login(String username,String password){
        System.out.println(">>>>>>>u:"+username+",p:"+password);
        return "login success !";
    }
    public String logout(){
        return "logout success !";
    }
    public String log(){
        return  "日志为...";
    }
    public String first() {
        return "first";
    }
    public String second(){
        return "second";
    }
}
