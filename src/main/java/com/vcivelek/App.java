package com.vcivelek;

public class App {
    public static void main(String[] args) {
        UserOps userOps = new UserOps();
        User vc = new User("volkan", "civelek");
        User ft = new User("fatih", "terim");
        userOps.save(vc);
        userOps.save(ft);

        // read back
        User rb = userOps.get(vc);
        System.out.println(rb.getFirstName() + " " + rb.getLastName());
    }
}


//CREATE KEYSPACE mapper_test WITH replication = {'class':'SimpleStrategy', 'replication_factor' : 1};
//CREATE TABLE mapper_test.user(
//    firstName text,
//    lastName text,
//    PRIMARY KEY(firstName, lastName)
//);

//cqlsh> select * from mapper_test.user ;
//
//firstname | lastname
//-----------+----------
//volkan |  civelek
//fatih |    terim
//
//(2 rows)