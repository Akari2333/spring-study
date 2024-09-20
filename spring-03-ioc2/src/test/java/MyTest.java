import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        // Spring容器, 就类似于婚介网站
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");
        System.out.println(user == user2);
        user.show();

        /**
         * UserT被创建了
         * name秦疆
         *
         * 进程已结束,退出代码0
         * */

        // 结论：在配置文件加载的时候, 容器(beans对象)中管理的对象都已经初始化了！
    }
}
