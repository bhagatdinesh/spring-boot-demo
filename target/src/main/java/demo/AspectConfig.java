package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import demo.aspect.UserServiceAspect;

@Configuration
@EnableAspectJAutoProxy
public class AspectConfig {
  @Bean
  public UserService userService(){
	 return new UserService();
  }
  @Bean	
  public UserServiceAspect userAspect(){
	 return new UserServiceAspect();
  }
} 