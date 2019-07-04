import com.oaec.spring.entity.Book;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
* spring的IOC容器，反转资源获取得方式
* */
public class HelloWorld {
    public static void main(String[] args) {
        /*Book book = new Book();
        book.setBookId(1);
        book.setName("ddd");
        book.setAuthor("dd");
        book.setPrice(9.9);
        System.out.println("book = " + book);

        //初始化Spring的IOC容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object book = context.getBean("book");
        System.out.println("book = " + book);
        System.out.println("-------------------");
        Object book2 = context.getBean("book2");
        System.out.println(book2);*/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*Object person1 = context.getBean("person1");
        System.out.println("person1 = " + person1);*/
        System.out.println("----------------");
        Object person2 = context.getBean("person2");
        System.out.println("person2 = " + person2);

    }
}
