import com.kuang.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");

        // day4
//        System.out.println(student.getName());      // name已注入
//        System.out.println(student.getAddress());   // 其余为配置, 为null

        // day5 - 依赖注入之set注入
        System.out.println(student.toString());
    }
}
