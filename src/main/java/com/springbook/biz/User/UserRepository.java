package com.springbook.biz.User;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends CrudRepository<User, Long>{
	  @Query(value="SELECT * FROM Users WHERE id = :id and password = :password",nativeQuery = true)
	  User findUser(@Param("id")String id, @Param("password")String password);
}
