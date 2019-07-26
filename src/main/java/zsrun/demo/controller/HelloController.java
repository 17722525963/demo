package zsrun.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String say() {
        return "Hello Miss 傻×";
    }

    @RequestMapping("/test")
    public String hahah() {
        return "这个玩意儿怎么学？？？";
    }

    @RequestMapping("/devtool")
    public String test() {
        return "热启动测试——测试成功了吗！飒飒飒飒飒飒飒飒";
    }

}
