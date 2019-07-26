package zsrun.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zsrun.demo.entity.User;

import java.util.*;

@RestController
@RequestMapping("user")
public class JsonResponseController {

    /**
     * 获取用户信息
     *
     * @return
     */
    @RequestMapping("/getUserInfo")
    public User getUserInfo() {
        User user = new User();
        user.setUage(26);
        user.setUdesc("这是一个粉刷匠");
        user.setUid("007");
        user.setUname("本领强");
        return user;
    }

    @RequestMapping("/getUserList")
    public List<User> getUserList() {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUage(i);
            user.setUdesc("这是一个粉刷匠" + i);
            user.setUid("007" + i);
            user.setUname("本领强" + i);
            list.add(user);
        }
        return list;
    }

    @RequestMapping("/getUserMap")
    public Map<String, User> getUserMap() {
        Map<String, User> userMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUname("测试" + i);
            user.setUid(i + "");
            user.setUdesc(null);
            user.setUage(i);
            if (i == 2) {
                user.setBirthday(null);
            } else {
                user.setBirthday(new Date());
            }
            userMap.put("user" + i, user);
        }
        return userMap;
    }

}
