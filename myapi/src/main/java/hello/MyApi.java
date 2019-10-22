package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/List")
public interface MyApi {
    @RequestMapping(value = "/name", method = RequestMethod.GET)
    String getName(@RequestParam("name") String name);
}
