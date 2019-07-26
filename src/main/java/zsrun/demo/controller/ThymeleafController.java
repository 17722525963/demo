package zsrun.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import zsrun.demo.entity.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ThymeleafController {

    @RequestMapping("/show")
    public String show(ModelMap modelMap) {
        User user = new User();
        user.setBirthday(new Date());
        user.setUage(26);
        user.setUid("007");
        user.setUdesc("<font color='green'><b>这厮是一个人</b></font>");
        user.setUname("lee");
        modelMap.addAttribute("user", user);


        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            User users = new User();
            users.setBirthday(new Date());
            users.setUage(15 + i);
            users.setUid("007" + i);
            users.setUdesc("这厮是个人" + i);
            users.setUname("张三丰" + i);
            userList.add(users);
        }

        modelMap.addAttribute("userList", userList);


        return "thymeleaf/show";
    }

    @RequestMapping("/index")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("name", "张三丰");
        return "thymeleaf/index";
    }

    /**
     * 接收表单提交信息
     */
    @PostMapping("postform")
    public String postForm(User user) {
        System.out.println("姓名：" + user.getUname());
        System.out.println("年龄：" + user.getUage());

        return "redirect:/index";//重定向地址
    }

}
