package ch.stefanhohl.sh.simplecounter.controller;

import java.util.logging.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author stefan.hohl
 * @version 16.10.2021
 */

@CrossOrigin(origins = "*", maxAge = 3600)
@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/api")
public class RestController {
    private static final Logger LOGGER = Logger.getLogger( RestController.class.getName() );
    long count = 0;

    @GetMapping(value = "/getAmount")
    public long getAmount(HttpServletRequest request) {
        LOGGER.info(request.getRemoteAddr());
        return count++;
    }
}
