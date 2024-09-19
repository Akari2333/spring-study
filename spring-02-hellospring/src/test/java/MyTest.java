import com.kuang.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 创建和配置bean
        // context 获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 我们的对象现在都在Spring中管理了, 我们要使用, 直接去里面提取出来就可以!
        Hello hello = (Hello) context.getBean("hello"); // hello不是new出来的的, 是从容器中拿出来的
        System.out.println(hello.toString());

        /*
         Hello{str='Spring'}
        */
    }
}
