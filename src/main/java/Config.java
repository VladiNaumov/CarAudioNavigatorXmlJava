import audio.Kenwood;
import audio.Sony;
import car.Audi;
import car.Kia;
import car.Lexus;
import interfaces.AudioSystem;
import interfaces.NavigationSystem;
import navigation.Navitel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {

    @Bean
    public AudioSystem sonyAudio(){
        return new Sony();
    }
    @Bean
    public NavigationSystem navitelNav(){
        return new Navitel();
    }

    @Bean
    public Audi car(AudioSystem audioSystem, NavigationSystem navigationSystem){
        return new Audi(audioSystem,navigationSystem);
    }

    @Bean
    public Kia car2(AudioSystem audioSystem, NavigationSystem navigationSystem){
        return new Kia(audioSystem,navigationSystem);
    }
}
