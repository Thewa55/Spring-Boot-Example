package com.Kenny.DAO;

import com.Kenny.Entity.Post;

import java.util.Collection;

public interface PostDAO {
    Collection<Post> getAllPosts();

    Post getPostById(int id);

    void deletePostById(int id);

    void updatePost(Post post);

    void addPost(Post post);
}
