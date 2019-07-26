package zsrun.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("iii")
public class TestController {

    @RequestMapping("lll")
    public String test(){
        return "热阿萨飒飒了？？";
    }

}
