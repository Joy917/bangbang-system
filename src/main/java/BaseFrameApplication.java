import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableJpaAuditing
@EnableJpaRepositories({"com.bangbang.baseframe.dao"})
@EntityScan({"com.bangbang.baseframe.entities"})
@ComponentScan({"com.bangbang.baseframe"})
public class BaseFrameApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BaseFrameApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BaseFrameApplication.class);
	}
}

