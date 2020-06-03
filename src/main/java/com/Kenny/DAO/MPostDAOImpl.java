package com.Kenny.DAO;

import com.Kenny.Entity.Post;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("mongo")
public class MPostDAOImpl implements PostDAO {


    @Override
    public Collection<Post> getAllPosts() {
        return new ArrayList<Post>(){
            {
                add(new Post(1, "Kenny", "Hello!", "Hello World!"));
            }
        };
    }

    @Override
    public Post getPostById(int id) {
        return null;
    }

    @Override
    public void deletePostById(int id) {

    }

    @Override
    public void updatePost(Post post) {

    }

    @Override
    public void addPost(Post post) {

    }
}
