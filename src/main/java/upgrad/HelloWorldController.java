package upgrad;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //registers the class as a Spring MVC controller in the IOC container.
public class HelloWorldController {
    @RequestMapping("/hellospring") //requests mapping a specific url request with the controller method , we define a specific url to access the helloword controller
   // @ResponseBody //returns to the user as an HTTP response ,
    // "we removed this annotation because we don't want to return this page, as writing this part returns static portion, we find that
    //it if we used this annotation, it returns index written on web page, it does not searches index anywhere and returns what written there

    public String helloSpring(){
        //return "Hello Spring";
        return "index"; // thymeleaf and dispatcher intercepts the return index and find index in appropriate folder
    }
}
