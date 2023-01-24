package fieraru.industries.cvportal;

import fieraru.industries.cvportal.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class CvPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvPortalApplication.class, args);
		System.out.println("seccondCOmmit");
	}

}
