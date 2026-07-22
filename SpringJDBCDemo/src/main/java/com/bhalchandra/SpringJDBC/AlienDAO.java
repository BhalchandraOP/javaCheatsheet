package com.bhalchandra.SpringJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.autoconfigure.JdbcProperties.Template;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bhalchandra.SpringJDBC.model.Alien;

@Repository
public class AlienDAO {
	
	private JdbcTemplate template;
	
	public JdbcTemplate getJdbctemplate() {
		return template;
	}
@Autowired
	public void setJdbctemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void save(Alien alien) {
//		System.out.println("Added");
		String sql = "insert into alien (id,name,tech) values (?,?,?)";
		
		int rows = template.update(sql,alien.getId(),alien.getName(),alien.getTech());
		System.out.println("No of rows affected: "+ rows);
	}
	
	public List<Alien> findAll(){
		String sql = "select * from alien";
		RowMapper<Alien> mapper = ( rs,rowNum) -> {
				
				Alien a = new Alien();
				a.setId(rs.getInt(1));
				a.setName(rs.getNString(2));
				a.setTech(rs.getNString(3));
				// TODO Auto-generated method stub
				return a;
				};
		return template.query(sql, mapper);
	}
}
