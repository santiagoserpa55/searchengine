package com.santiago.app.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.santiago.app.model.DataModel;

import javax.sql.DataSource;

@Repository
public class DataRepository {
	// repositorio -> objeto que se encarga de hacer la conex con la DB y enviarlos
	// un poco mas arriba en tu logica

	private final NamedParameterJdbcTemplate jdbcTemplate;
	private final DataMapper mapper = new DataMapper();

	// inyeccion de dependencias asi que ya podemos usar el objeto
	public DataRepository(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.jdbcTemplate = namedParameterJdbcTemplate;
	}

	public List<DataModel> getData() {
		String getQuery = "SELECT subscription_date, city, company, country, customer_id, email, first_name, last_name FROM customers";
		/*
		 * debemos mapear los campos que estan en la base de datos para que existan en
		 * java, usamos un mapper
		 * 
		 */
		return jdbcTemplate.query(getQuery, mapper);
	}

	private static class DataMapper implements RowMapper<DataModel> {

		@Override
		public DataModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			String subscriptionDate = rs.getString("subscription_date");
			String customerId = rs.getString("customer_id");
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			String company = rs.getString("company");
			String city = rs.getString("city");
			String country = rs.getString("country");
			String email = rs.getString("email");
			return new DataModel(subscriptionDate, customerId, firstName, lastName, company, city,country, email);
		}

	}

}
