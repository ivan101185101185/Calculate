import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Application {

    @ResponseBody
    @RequestMapping("/test")

    public Integer getVolumes(@RequestBody CalcData calcdata) {
        Integer output = 0;

        switch (calcdata.getOperator()) {
            case "+":
                output = calcdata.getVal1() + calcdata.getval2();
                break;
            case "-":
                output = calcdata.getVal1() - calcdata.getval2();
                break;
            case "/":
                output = calcdata.getVal1() / calcdata.getval2();
                break;
            case "*":
                output = calcdata.getVal1() * calcdata.getval2();
                break;
        }
        return (output);
    }


    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

}