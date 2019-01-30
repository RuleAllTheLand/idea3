package utils;

import bean.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserIO {
    private static List<User> users=new ArrayList<User>();
    private static final String USER_FILE="user.obj";

    //写入用户列表
    public  boolean WriteUsers() throws BusinessException{
        try{
            ObjectOutputStream out=new ObjectOutputStream(
                    new FileOutputStream(USER_FILE));
            out.writeObject(users);
            out.close();
            return true;
        }catch (IOException e){
            throw new BusinessException("io.write.error");
        }

    }

    /**
     * 4654654
     * @return
     * @throws BusinessException
     */
    //读取用户列表
    public boolean readUsers() throws  BusinessException{
        try{
                ObjectInputStream in=new ObjectInputStream(new FileInputStream(USER_FILE));
                users=  (List<User>)in.readObject();
                in.close();
                return  true;
            } catch ( Exception e) {
               throw new BusinessException("io.read.error");
            }
    }/*
    */

    //添加用户
    public void add(User user){
        user.setId(users.size()+1);//自增的id
        users.add(user);
    }
}
