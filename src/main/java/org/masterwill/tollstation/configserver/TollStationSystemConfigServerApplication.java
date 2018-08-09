package org.masterwill.tollstation.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TollStationSystemConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TollStationSystemConfigServerApplication.class, args);
	}
}
