package com.blogApplication.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.blogApplication.project.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {


}
