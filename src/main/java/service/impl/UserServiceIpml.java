package service.impl;

import bean.User;
import service.UserService;
import utils.BusinessException;
import utils.EmptyUtils;
import utils.UserIO;

public class UserServiceIpml implements UserService {

    public User register(User user) throws BusinessException {
        UserIO userIO=new UserIO();
        userIO.add(user);
        try {
            userIO.WriteUsers();
        }catch (BusinessException e){

        }
        return user;
    }

    public User login(String username, String password) throws BusinessException {
        if(EmptyUtils.isEmpty(username)){
            throw new BusinessException("username.notnull");
        }
        if(EmptyUtils.isEmpty(password)){
            throw new BusinessException("password.notnull");
        }
        //验证
        UserIO userIO=new UserIO();


        return  userIO.findByUsernameAndPassword(username,password);
    }
}
