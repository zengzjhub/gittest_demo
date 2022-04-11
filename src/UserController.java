public class UserController {
    public String login(String username,String password){
        System.out.println(">>>>>>>u:"+username+",p:"+password);
        return "login success !";
    }
    public String logout(){
        return "logout success !";
    }
}
