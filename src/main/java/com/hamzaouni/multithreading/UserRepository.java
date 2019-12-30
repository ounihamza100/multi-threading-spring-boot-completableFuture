package com.hamzaouni.multithreading;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Hamza Ouni
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
