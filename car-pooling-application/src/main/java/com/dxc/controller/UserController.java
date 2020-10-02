package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.User;
import com.dxc.service.UserService;

@RestController
@RequestMapping("/newuser")
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/allusers")
	public List<User> getAllUsers(){
		return userService.findAll();

	}
	
	@PostMapping("/details")
	public ResponseEntity<?> saveUser(@RequestBody User user){
		userService.saveOrUpdateUser(user);
		return new ResponseEntity("User Registered successfully", HttpStatus.OK);
	}
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception{
		String tempEmailId=user.getEmail();
		String tempPassword=user.getPassword();
		User user2=null;
		if(tempEmailId!=null && tempPassword!=null) {
			user2=userService.findByEmailAndPassword(tempEmailId, tempPassword);
		}
		if(user2==null) {
			 throw new Exception("Bad credentials");
		}
		return user2;
	}
	@GetMapping(value="/{email}")
	public User findByEmail(@PathVariable String email ) {
		return userService.findByEmail(email);
	}
	@DeleteMapping(value="/{uId}")
	public ResponseEntity<?> deleteUser(@PathVariable Integer uId) {
		userService.deleteUser(uId);
		return new ResponseEntity("User deleted successfully", HttpStatus.OK);
	}
	@PutMapping("/updateuser/{uId}")
    public ResponseEntity<?> updateUser(@PathVariable(value = "uId") Integer uId,
            @RequestBody User user) {
        User user1= userService.findById(uId);

 

        user1.setFname(user.getFname());
        user1.setLname(user.getLname());
        user1.setPassword(user.getPassword());
        user1.setEmail(user.getEmail());
        user1.setPhoneNo(user.getPhoneNo());
        user1.setDob(user.getDob());
        user1.setPhoneNo(user.getPhoneNo());

 

        userService.saveOrUpdateUser(user);
        return new ResponseEntity("your data updated successfully", HttpStatus.OK);
    }
}
