package com.dkb.entity;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "PostComment")
@Table(name = "post_comment")
@org.hibernate.annotations.Cache(
    usage = CacheConcurrencyStrategy.READ_WRITE
)
@Data
public class PostComment {
 
    @Id
    @GeneratedValue
    private Long id;
 
    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;
 
    private String review;
 
    //Getters and setters omitted for brevity
}