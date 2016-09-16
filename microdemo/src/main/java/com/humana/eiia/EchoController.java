package com.humana.eiia;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/echo")
	public Echo echo(@RequestParam(value="message", defaultValue="..crickets..") String name){
		return new Echo(counter.incrementAndGet(), name);
		}
}
