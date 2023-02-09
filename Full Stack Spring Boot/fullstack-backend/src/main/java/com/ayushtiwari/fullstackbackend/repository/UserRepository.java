package com.ayushtiwari.fullstackbackend.repository;

import com.ayushtiwari.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
