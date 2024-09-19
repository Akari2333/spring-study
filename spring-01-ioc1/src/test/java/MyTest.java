import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoOracleImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        /*
        day2 原先这种代码彻底屏蔽掉

            // 用户实际调用的是业务层, dao层他们不需要接触
            UserService userService = new UserServiceImpl();

            // ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
            // ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
            ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
            userService.getUser();
        */

        // 获取ApplicationContext: 拿到Spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 容器在手, 天下我有. 需要什么, 就直接get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();  // 输出: Mysql获取数据! (由 beans.xml 控制)
    }
}
