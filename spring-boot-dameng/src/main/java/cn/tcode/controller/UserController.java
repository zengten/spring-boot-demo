package cn.tcode.controller;

import cn.tcode.entity.User;
import cn.tcode.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/selectUser")
    public List<User> selectUser() {
        return userService.list();
    }

    @GetMapping("/insertUser")
    public String insertUser() {
        User user = new User();
        Random random = new Random();
        user.setName("张三" + random.nextInt(1000));
        user.setAge(random.nextInt(100));
        userService.save(user);
        return "insert OK!";
    }


    @GetMapping("/updateById/{id}")
    public String updateById(@PathVariable Long id) {
        User user = new User();
        Random random = new Random();
        user.setName("张三" + random.nextInt(1000));
        user.setAge(random.nextInt(100));
        user.setId(id);
        userService.updateById(user);
        return "OK!";
    }

    @GetMapping("/removeById/{id}")
    public String removeById(@PathVariable Long id) {
        userService.removeById(id);
        return "OK!";
    }
}
