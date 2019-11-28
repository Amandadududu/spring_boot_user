package com.qf.spring_boot_user;

import com.qf.service.IUserService;
import com.qf.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ：lisuqin
 * @date ：Created in 2019/11/27 21:56
 */

@Controller
public class UserController {

    @Autowired
    private IUserService userService;
    @RequestMapping("getUserList")
    public String getUserList(ModelMap map){

        List<User> userList=userService.list();

        map.put("userList",userList);
        return "stuList";

    }
    @RequestMapping("deleteUserById")
    public String deleteUserById(int userId){

        userService.removeById(userId);
        return "redirect:/getUserList";

    }

    @RequestMapping("toUpdateUser")
    public String toUpdateUser(int userId,ModelMap map){

        User user = userService.getById(userId);
        System.out.println(user);

        map.put("user",user);
        return "update";
    }

    @RequestMapping("updateUserById")
    public String updateUserById(User user){

        userService.updateById(user);
        return "redirect:/getUserList";
    }

    @RequestMapping("toAadUser")
    public String toAadUser(){

        return "addUser";
    }
    @RequestMapping("addUser")
    public String addUser(User user){

        userService.save(user);
        return "redirect:/getUserList";
    }
}
