package service.impl;

import bean.User;
import service.UserService;
import utils.BusinessException;
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
}
