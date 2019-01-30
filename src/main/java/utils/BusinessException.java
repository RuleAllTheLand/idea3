package utils;

/**
 * 异常类
 */
public class BusinessException extends  RuntimeException {
    public BusinessException(){

    }
    public BusinessException(String errorMessage){
        super(errorMessage);
    }

}
