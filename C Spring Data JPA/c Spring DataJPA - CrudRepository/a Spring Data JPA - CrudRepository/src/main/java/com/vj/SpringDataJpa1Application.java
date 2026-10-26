package com.vj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) 
	{
		 SpringApplication.run( SpringDataJpa1Application.class, args);
	}

}


// Output:-

/*

jdk.proxy2.$Proxy97
Hibernate: 
    select
        s1_0.id,
        s1_0.city,
        s1_0.name 
    from
        student s1_0 
    where
        s1_0.id=?
Hibernate: 
    insert 
    into
        student
        (city, name, id) 
    values
        (?, ?, ?)
        
---------------------------------------------
 
mysql> select * from student;
Empty set (0.00 sec)

mysql> select * from student;
+-----+--------+--------+
| id  | city   | name   |
+-----+--------+--------+
| 101 | Indore | Vishal |
+-----+--------+--------+
1 row in set (0.00 sec)


*/