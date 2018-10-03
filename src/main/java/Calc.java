import net.minidev.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration



public class Calc {

    @PostMapping(value = "/test")
    String test (@RequestBody JSONObject numbers) {
        String numb1 = (String) numbers.get("val1");
        String numb2 = (String) numbers.get("val2");
        String mathOp = (String) numbers.get("operator");
        int output = 0;
        switch (mathOp) {
            case "+":
              output = Integer.parseInt(numb1) + Integer.parseInt(numb2);
                break;
            case "-":
               output = Integer.parseInt(numb1) - Integer.parseInt(numb2);
                break;
            case "/":
               output = Integer.parseInt(numb1) / Integer.parseInt(numb2);
                break;
            case "*":
                output = Integer.parseInt(numb1) * Integer.parseInt(numb2);
                break;
        }


        return ("Output: "+ Integer.toString(output));
    }

    public static void main(String[] args) {

        SpringApplication.run(Calc.class, args);
    }

}

