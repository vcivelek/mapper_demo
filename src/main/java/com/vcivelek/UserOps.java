package com.vcivelek;

import com.datastax.driver.mapping.Mapper;

public class UserOps {
    private Dse cassandra = new Dse();
    private Mapper<User> mapper = cassandra.getMapper(User.class);

    public void save(User user){
        mapper.save(user);
    }

    public User get(User user){
        return mapper.get(user.getFirstName(), user.getLastName());
    }
}
