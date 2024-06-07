package jpa.jpa_learn.repository;

import jpa.jpa_learn.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PersonJdbcDao {


    @Autowired
    JdbcTemplate jdbcTemplate;

    static class PersonRow implements RowMapper<Person>{

        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person = new Person();
            person.setId(rs.getInt("id"));
            person.setName(rs.getString("name"));
            person.setLocation(rs.getString("location"));
            return person;
        }
    }

    public List<Person> findAll() {
        return jdbcTemplate.query("Select * from Person", new PersonRow());
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject("Select * from Person where id = ?",
                new BeanPropertyRowMapper<>(Person.class),id);
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("delete from Person where id = ?", id);
    }

    public int insert(Person person) {
        return jdbcTemplate.update("insert into Person (id, name ,location ) values(?,?,?);",
                person.getId(),person.getName(),person.getLocation());
    }

    public int update(Person person) {
        return jdbcTemplate.update("update Person set name = ? , location = ? where id = ?",
                person.getName(),person.getLocation(),person.getId());
    }



}
