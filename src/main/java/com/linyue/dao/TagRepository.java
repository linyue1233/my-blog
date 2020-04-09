package com.linyue.dao;

import com.linyue.entity.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);

    @Query("select t from t_tag  t")
    List<Tag> findTop(Pageable pageable);
}
