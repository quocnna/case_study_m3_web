package cg.m3.furama.repository;

import cg.m3.furama.model.Customer;
import cg.m3.furama.model.CustomerType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements BaseRepository<Customer> {
    private static final String FIND_ALL = "select * from customer c join customer_type t on c.customer_type_id = t.id order by c.id desc";
//    private static final String FIND_BY = "select * from product p join category c on p.category_id = c.id where p.$ like ?";
//    private static final String FIND = "select * from product p join category c on p.category_id = c.id where p.name like '%?%' or p.color like '%?%' or p.price like '%?%' or c.name like '%?%'";
//    private static final String CREATE = "insert into product (name, color, price, category_id) values (?,?,?,?)";
//    private static final String DELETE = "delete from product where id = ?";

    @Override
    public List<Customer> findAll() {
        List<Customer> result = new ArrayList<>();

        try (Connection connection = Configuration.getConnection();
             PreparedStatement st = connection.prepareStatement(FIND_ALL)) {
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                result.add(getCustomer(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public void save() {

    }

    @Override
    public List<Customer> find(String q) {
        return null;
    }

    private Customer getCustomer(ResultSet rs) throws SQLException {
        int id = rs.getInt(1);
        String fullName = rs.getString(2);
        String birthday = rs.getString(3);
        Boolean gender = rs.getBoolean(4);
        String identifyNumber = rs.getString(5);
        String phone = rs.getString(6);
        String email = rs.getString(7);
        String address = rs.getString(8);
        int customerTypeId = rs.getInt(9);
        String customerTypeName = rs.getString(11);

        CustomerType customerType = new CustomerType(customerTypeId, customerTypeName);
        Customer customer = new Customer(id, fullName, birthday, gender, identifyNumber, phone, email, address, customerType);
        return customer;
    }
}
