package ui;

import utils.BusinessException;
import utils.UserIO;

public class WelcomeClass extends  BaseClass {
    public void start(){
        println(getString("info.welcome"));
        UserIO userIO=new UserIO();
        userIO.readUsers();
        boolean flag=true;
        while(flag){
            println(getString("info.login.reg"));
            println(getString("info.select"));
            String select=input.nextLine();

            if(select==null){
                println(getString("input.error"));
                break;
            }
            switch (select.charAt(0)){
                case  '1':
                    try {
                        new LoginClass().login();
                        flag=false;
                        println(getString("login.susscess"));
                    }catch (BusinessException e){
                        println(getString(e.getMessage()));
                    }

                    break;
                case '2':
                    flag=false;
                     try{
                         new RegisterClass().registes();
                         println(getString("reg.succss"));
                     }catch ( BusinessException e){
                            println(getString("reg.error"));//注册失败
                     }
                    break;
                    default:
                        println(getString("input.error"));
                        break;
            }
        }
    }
}
