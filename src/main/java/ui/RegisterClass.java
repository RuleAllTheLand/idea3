package ui;

import bean.User;
import service.UserService;
import service.impl.UserServiceIpml;
import utils.BusinessException;

public class RegisterClass extends  BaseClass{
    public void registes() throws BusinessException {
        println(getString("input.uername"));//输入用户名
        String username=input.nextLine();
        println(getString("input.password"));
        String password=input.nextLine();//输入密码
        User user=new User(username,password);//封装用户
        UserService userService=new UserServiceIpml();
        userService.register(user);
    }
}
