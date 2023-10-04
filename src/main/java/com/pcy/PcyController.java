	package com.pcy;
	
	import javax.annotation.PostConstruct;
	
	import org.springframework.beans.factory.annotation.Value;
	import org.springframework.stereotype.Controller;
	
	import lombok.extern.slf4j.Slf4j;
	
	@Slf4j
	@Controller
	public class PcyController {

		@Value("${pcy.password}")
		private String password;
	
		@PostConstruct
		private void init() {
			log.info("{} {}.", "Password is", password);
		}
	
	}
