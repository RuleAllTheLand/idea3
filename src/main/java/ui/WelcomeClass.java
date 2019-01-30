package ui;

import utils.BusinessException;

public class WelcomeClass extends  BaseClass {
    public void start(){
        println(getString("info.welcome"));
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
                    flag=false;
                    System.out.println("登陆");
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
