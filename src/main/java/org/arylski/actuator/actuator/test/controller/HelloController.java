package org.arylski.actuator.actuator.test.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value="/hello", description = "Greetings operations")
@RestController
@RequestMapping("/hello")
public class HelloController {

    public HelloController() {
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok"),
            @ApiResponse(code = 404, message = "Greetings resource not found"),
            @ApiResponse(code = 400, message = "Bad request")})
    @GetMapping("/greetings")
    public ResponseEntity<Object> getGreetings() {
        return new ResponseEntity<>("Greetings traveller", HttpStatus.OK);
    }
}
