import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(bean == bean1);

        Cat barsik = (Cat) applicationContext.getBean("cat");
        Cat murka = (Cat) applicationContext.getBean("cat");

        System.out.println(barsik == murka);

        System.out.println(bean.getMessage());
        System.out.println(barsik.getMessage());
    }
}