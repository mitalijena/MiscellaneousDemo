package springjdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

//@Component
public class EmployeeDaoImpl {
	
	//@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Employee getEmployee() {
		return (Employee) jdbcTemplate.query("select * from employee", new EmployeeMapper());
	}

}
