package top.ijiaren.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.ijiaren.service.IProblemService;

@Controller
public class HelloWorldController {

    @Autowired
    private IProblemService problemService;

    @ResponseBody
    @RequestMapping("/hello")
    public String helloWorld() {
        int[] origin = new int[]{7, 4,5,4,2, 11, 1};
        int[] target = problemService.twoSum(origin, 9);
         return "hello world";
    }
}
