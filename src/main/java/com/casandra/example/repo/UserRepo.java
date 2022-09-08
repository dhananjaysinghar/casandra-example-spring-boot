package com.casandra.example.repo;

import com.casandra.example.entity.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CassandraRepository<User, String> {
}
