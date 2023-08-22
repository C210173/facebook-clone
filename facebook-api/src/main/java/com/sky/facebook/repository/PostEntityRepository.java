package com.sky.facebook.repository;

import com.sky.facebook.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostEntityRepository extends JpaRepository<PostEntity, String> {
}
