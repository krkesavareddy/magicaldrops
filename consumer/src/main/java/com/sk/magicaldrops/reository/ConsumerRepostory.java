package com.sk.magicaldrops.reository;

import com.sk.magicaldrops.Entity.ConsumerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ConsumerRepostory extends JpaRepository<ConsumerEntity,Long> {

    //ConsumerEntity save(ConsumerEntity consumerEntity);
}
