package com.wjy.myspringbootdemo.dao;

import org.springframework.data.repository.CrudRepository;

import com.wjy.myspringbootdemo.models.User;


/**
 * Spring Data的核心接口里面Repository是最基本的接口了,
 * spring提供了很多实现了该接口的基本接口,如:CrudRepository，PagingAndSortingRepository，SimpleJpaRepository，QueryDslJpaRepository等大量查询接口
 */
public interface UserRepository extends CrudRepository<User, Long>
{

}
