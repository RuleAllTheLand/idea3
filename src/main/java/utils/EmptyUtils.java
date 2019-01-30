package utils;

public class EmptyUtils {
    /**
     * 判断字符串是否为空
     * @param s
     * @return
     */
    public static boolean isEmpty(String s){
            if(null==s||"".equals(s)){
                return true;
            }else{
                return false;
            }
    }
}