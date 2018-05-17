package com.dkb.dao;

import com.dkb.entity.Post;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by dinesh.bhagat on 29/04/18.
 */
/*@Transactional*/
public interface PostDao extends CrudRepository<Post, Long> {
}
