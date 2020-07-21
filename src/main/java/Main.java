import audio.Alpine;
import audio.Kenwood;
import audio.Sony;
import car.Audi;
import car.Kia;
import car.Lexus;
import interfaces.AudioSystem;
import interfaces.Car;
import interfaces.NavigationSystem;
import navigation.Garmin;
import navigation.Navitel;
import navigation.Pioneer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main( String[] args )
    {
        /*

        //Связывание объектов Через Spring  XML configuration

        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml"); // указываем файл context.xml каторый будем использовать

        Audi audi = ctx.getBean("audi", Audi.class); // указываем Id Bein и какой класс мы хотим получить
        audi.move();

        audi.getAudioSystem().playRadio();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        Lexus lexus = ctx.getBean("lixus", Lexus.class);
        lexus.move();

        lexus.getAudioSystem().playCD();
        lexus.getNavigationSystem().createRoute();


         */

        //Связывание объектов Через Spring java configuration

        ApplicationContext  ctx = new AnnotationConfigApplicationContext(Config.class); // File java configuration

        Audi audi = ctx.getBean(Audi.class);
        audi.move();
        audi.getNavigationSystem().createRoute();
        audi.getAudioSystem().playRadio();

        Kia kia =  ctx.getBean(Kia.class);
        kia.move();
        kia.getNavigationSystem().createRoute();
        kia.getAudioSystem().playCD();
        
        /*
        System.out.println("******** первый способ ***********");
        Lexus audi = new Lexus();
        audi.setAudioSystem(new Kenwood());
        audi.setNavigationSystem(new Garmin());

        audi.move();
        audi.getNavigationSystem().createRoute();
        audi.getAudioSystem().playCD();

        System.out.println("******** второй способ ***********");

        Sony sony = new Sony();
        Navitel navitel = new Navitel();
        Kia kia = new Kia(sony,navitel);

        kia.move();
        kia.getAudioSystem().playRadio();
        kia.getNavigationSystem().createRoute();

        System.out.println("******** three способ ***********");

        Audi car = new Audi(new Sony(), new Pioneer());
        car.move();
        car.getNavigationSystem().createRoute();
        car.getAudioSystem().playRadio();


         */

    }
}
