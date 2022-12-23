package com.example.configurationserver;

import org.apache.hc.core5.reactor.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.StreamSupport;

@EnableConfigServer
@SpringBootApplication
public class ConfigurationServerApplication implements CommandLineRunner {

	@Autowired
	Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationServerApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		/*Map<String, Object> map =  ((AbstractEnvironment) environment).getSystemProperties();

		final MutablePropertySources sources = ((AbstractEnvironment) environment).getPropertySources();
		StreamSupport.stream(sources.spliterator(), false)
				.filter(EnumerablePropertySource.class::isInstance)
				.map(ps -> ((EnumerablePropertySource<?>) ps).getPropertyNames())
				.flatMap(Arrays::stream)
				.distinct()
				.forEach(prop -> {
					System.out.println(environment.getProperty(prop));
				});*/
	}
}
