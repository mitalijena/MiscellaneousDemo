package springjdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setEmployeeId(rs.getInt("id"));
		emp.setEmployeeName(rs.getString("employeeName"));
		emp.setSalary(rs.getDouble("salary"));
		return emp;
	}

}
