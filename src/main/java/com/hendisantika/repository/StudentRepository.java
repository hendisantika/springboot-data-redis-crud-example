package com.hendisantika.repository;

import com.hendisantika.model.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-data-redis-crud-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/04/22
 * Time: 15.05
 */
public interface StudentRepository extends CrudRepository<Student, String> {
}
