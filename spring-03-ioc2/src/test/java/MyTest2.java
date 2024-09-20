    // day3 - Spring配置说明

import com.kuang.pojo.User;
import com.kuang.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest2 {
    public static void main(String[] args) {

        // Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        User user = (User) context.getBean("user");
//        User user = (User) context.getBean("userNew");    // 也能取出来
        UserT user = (UserT) context.getBean("u5");     // 导入是智能的, 即使不同的类重名, 会智能提取
        user.show();

    }
}
