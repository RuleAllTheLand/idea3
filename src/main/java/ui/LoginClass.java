package ui;

import bean.User;
import service.UserService;
import service.impl.UserServiceIpml;
import utils.BusinessException;
import utils.UserIO;

public class LoginClass extends BaseClass {
   public void login()throws BusinessException {
       println(getString("input.uername"));
       String username=input.nextLine();
       println(getString("input.password"));
       String password=input.nextLine();

       //验证登陆信息
       UserService userService=new UserServiceIpml();
        User user=userService.login(username,password);
        if(user!=null){
            currUser=user;
        }else {
            throw new BusinessException("login.error");
        }

   }
}
