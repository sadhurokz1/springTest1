import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springboot"})
public class SprignSample {

    public static void main(String[] args) {
        SpringApplication.run(SprignSample.class, args);
    }
}
