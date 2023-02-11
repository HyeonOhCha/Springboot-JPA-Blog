import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.repository.UserRepository;

@RestController
public class DummyControllerTest {

	@Autowired
	private UserRepository userRepository;
	
	// http://localhost:8000/blog/dummy/join(요청)
	//http의 body에 username, password, email  데이터를 가지고 (요청)
	@PostMapping ("/dummy/join")
	public String Join(String username,String password, String email) {
		System.out.println("username: "+username);
		System.out.println("password: "+password);
		System.out.println("email: "+email);
		
		userRepository.save(user);
		return "회원가입이 완료되었습니다."
	}
}
