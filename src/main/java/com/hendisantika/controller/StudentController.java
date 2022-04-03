package com.hendisantika.controller;

import com.hendisantika.repository.StudentRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-data-redis-crud-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/04/22
 * Time: 15.05
 */
@Tag(description = "Student resources that provides access to available student data", name = "Student Resource")
@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;
}
