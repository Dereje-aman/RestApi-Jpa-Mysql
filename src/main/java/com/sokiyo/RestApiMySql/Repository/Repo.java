package com.sokiyo.RestApiMySql.Repository;

import com.sokiyo.RestApiMySql.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<User,Integer> {
}
