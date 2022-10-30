package lk.himash.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.himash.dto.UserResponse;
import lk.himash.service.UserService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/users-api")
@RequiredArgsConstructor
public class UserRestController {

	private final UserService userService;

	@GetMapping("/findAllUser")
	public List<UserResponse> getAllUsers() {
		return userService.getUsers();
	}
	
	
}
