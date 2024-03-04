package in.harsha;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.harsha.entity.UserEntity;
import in.harsha.repo.UserRepositiry;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepositiry repositiry = context.getBean(UserRepositiry.class);
		UserEntity u1=new UserEntity();
		u1.setPid(121);
		u1.setPname("chocolates");
		u1.setPrice(355.00);
	    repositiry.save(u1);
		List<UserEntity> list = repositiry.findAll();
		list.forEach(e->{
			System.out.println(e);
		});
	}

}
