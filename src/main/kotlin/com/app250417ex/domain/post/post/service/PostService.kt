package com.app250417ex.domain.post.post.service

import com.app250417ex.domain.post.post.entity.Post
import com.app250417ex.domain.post.post.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(
    private val postRepository: PostRepository,
) {
    fun count() = postRepository.count()

    fun write(
        title: String,
        content: String,
    ): Post = postRepository.save(Post(title = title, content = content))

    fun findAll() = postRepository.findAll()
}
