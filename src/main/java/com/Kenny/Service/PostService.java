package com.Kenny.Service;

import java.util.Collection;

import com.Kenny.DAO.PostDAO;
import com.Kenny.Entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private PostDAO postDAO;

    public Collection<Post> getAllPosts(){
        return this.postDAO.getAllPosts();
    }

    public Post getPostById(int id){
        return this.postDAO.getPostById(id);
    }

    public void deletePostById(int id) {
        this.postDAO.deletePostById(id);
    }
}
