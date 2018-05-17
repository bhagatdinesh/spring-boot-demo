package com.dkb.dao;

import com.dkb.entity.Post;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by dinesh.bhagat on 30/04/18.
 */
@Repository
public class PostDaoImpl implements PostDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public <S extends Post> S save(S s) {
        entityManager.persist(s);
        return s;
    }

    @Override
    public <S extends Post> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Post> findById(Long aLong) {
        return Optional.ofNullable(entityManager.find(Post.class, aLong));
    }

    @Override
    public boolean existsById(Long aLong) {
        return findById(aLong).isPresent();
    }

    @Override
    public Iterable<Post> findAll() {
        String hql = "FROM Post as post ORDER BY post.id";
        return (List<Post>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public Iterable<Post> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Post post) {
        if (findById(post.getId()).isPresent()) {
            entityManager.remove(post);
        }
    }

    @Override
    public void deleteAll(Iterable<? extends Post> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
