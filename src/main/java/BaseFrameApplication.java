import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaAuditing
@EnableJpaRepositories({"com.bangbang.baseframe.entities"})
@ComponentScan({"com.bangbang.baseframe"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BaseFrameApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseFrameApplication.class, args);
	}

}

