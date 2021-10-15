package ch.stefanhohl.sh.simplecounter.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author stefan.hohl
 * @version 16.10.2021
 */

@CrossOrigin(origins = "*", maxAge = 3600)
@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/api")
public class RestController {

    int count = 0;

    @GetMapping(value = "/getAmount")
    public int getAmount() {
       return count++;
    }
}
