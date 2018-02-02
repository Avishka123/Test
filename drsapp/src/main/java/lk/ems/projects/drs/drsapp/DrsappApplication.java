package lk.ems.projects.drs.drsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ComponentScan(basePackages = {"lk.ems.projects.drs.*"})
@EntityScan(basePackages = {"lk.ems.projects.drs.entity"})
@EnableAutoConfiguration()
@EnableAsync
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class DrsappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrsappApplication.class, args);
	}
}
