package proxy; 
/** 
* @author WH 作者 E-mail: 
* @version 创建时间：2017年3月25日 下午4:06:10 
* 类说明 
*/
public class UserServiceImpl implements UserService {

    @Override
    public void print() {
        System.out.println("this is null args");
    }

    @Override
    public void print(String hello) {
        System.out.println("this  args is"+hello);
    }

}
 