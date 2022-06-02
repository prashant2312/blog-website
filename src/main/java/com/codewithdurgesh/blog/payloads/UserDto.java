package com.codewithdurgesh.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {


	private int id;

	@NotBlank
	@Size(min=4,message="User must be min od 4 character !!")
	private String name;
	
	@Email(message="Email address is not valid !!")
	@NotBlank
	private String email;
	
	@NotBlank
	@Size(min=4,max=10,message="Password must be min of 4 and maximum be 10")
//	@Pattern(regexp = )
	private String password;
	
	@NotBlank
	private String about;

}
