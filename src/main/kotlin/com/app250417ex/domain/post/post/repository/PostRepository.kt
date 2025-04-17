package com.app250417ex.domain.post.post.repository

import com.app250417ex.domain.post.post.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long>
