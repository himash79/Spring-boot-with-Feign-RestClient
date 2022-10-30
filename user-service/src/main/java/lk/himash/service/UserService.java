package lk.himash.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import lk.himash.dto.UserResponse;

@FeignClient(url="https://jsonplaceholder.typicode.com",name="USER-CLIENT")
public interface UserService {

	@GetMapping("/users")
	public List<UserResponse> getUsers();
	
}
