/**
 * 
 */
package com.api.resouces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wellington
 *
 */

@RestController
@RequestMapping("/teste")
public class MedicoResouce {

	@GetMapping
	public String lista() {
		
		return "TESTE REST";
	}
	
}
