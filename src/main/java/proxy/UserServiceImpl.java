package proxy; 
/** 
* @author WH 作者 E-mail: 
* @version 创建时间：2017年3月24日 下午3:01:24 
* 类说明 
*/
public class UserServiceImpl implements UserService {

    @Override
    public void goFly() {
       System.out.println("i can fly");

    }

    @Override
    public void stopFly(String name) {
        System.out.println("i can't fly");

    }
    
    public void eat(){
        System.out.println("i can eat ");
    }
    

}
 