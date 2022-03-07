package com.ecommerce.casestudy.dao;

import com.ecommerce.casestudy.entity.User;
import com.ecommerce.casestudy.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserDAO extends JpaRepository<User, Long> {

    public User findById(@Param("id") Integer id);

    public User findByEmail(@Param("email") String email);

    public List<User> findByLastName(@Param("lastName") String lastName);

    public List<User> findByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);

    public List<User> findByFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCase(@Param("firstName") String firstName, @Param("lastName") String lastName);

    //@Query("select u from User u where u.firstName = :firstName or u.lastName = :lastName")
    public List<User> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(@Param("firstName") String firstName, @Param("lastName") String lastName);

    @Query("select u from User u where u.firstName = :firstName")
    public List<User> findByFirstName(String firstName);

    @Query("select u from User u where u.username = :username")
    public User findByUsername(@Param("username") String uname);

    @Query(value="SELECT u.* FROM user u WHERE u.first_name like '%:firstName%'", nativeQuery = true)
    public List<User> findByFirstNameLike(String firstName);

    @Query("select ur from UserRole ur where ur.user.id = :userId")
    List<UserRole> getUserRoles(@Param("userId")  Integer userId);
}

