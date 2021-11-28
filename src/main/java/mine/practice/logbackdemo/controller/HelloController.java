package mine.practice.logbackdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author whc
 * @date 2021-11-28
 * @ClassName HelloController
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String helloResponse() {
        // 获取日志记录器
        Logger logger = LoggerFactory.getLogger(HelloController.class);

        logger.info("开始记录日志");
        logger.info("请求的url为/");

        int number = new Random().nextInt();
        logger.debug("随机数为" + number);

        logger.info("返回数据");
        return "hello world";
    }
}
