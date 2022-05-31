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

        Cat beanCat =
                (Cat) applicationContext.getBean("cat");

        Cat beanCat1 =
                (Cat) applicationContext.getBean("cat");

        boolean forHelloWord = bean == bean1;
        boolean forCat = beanCat == beanCat1;
        System.out.println("Сравнение бинов HelloWorld: " + forHelloWord);
        System.out.println("Сравнение бинов Cat: " + forCat);


        System.out.println(bean.getMessage());
    }
}