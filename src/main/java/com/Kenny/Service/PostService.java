package com.Kenny.Service;

import java.util.Collection;

import com.Kenny.DAO.PostDAO;
import com.Kenny.Entity.Post;

public class PostService {
    private PostDAO postDAO;

    public Collection<Post> getAllPosts(){
        return postDAO.getAllPosts();
    }
}
