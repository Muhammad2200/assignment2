package kilted_haggies;

public class Customer extends Project{
	
	    private int customer_id;
	    private String customer_name;
	    private String customer_email;
	    private String customer_phone;
	    
	    public Customer(int customer_id, String customer_name, String customer_email, String customer_phone) {
	        this.customer_id = customer_id;
	        this.customer_name = customer_name;
	        this.customer_email = customer_email;
	        this.customer_phone = customer_phone;
	    }
	    
	    public int getCustomerId() {
	        return customer_id;
	    }
	    
	    public String getCustomerName() {
	        return customer_name;
	    }
	    
	    public String getCustomerEmail() {
	        return customer_email;
	    }
	    
	    public String getCustomerPhone() {
	        return customer_phone;
	    }
	    public String toString() {
	        return "Customer ID: " + customer_id + "\n" +
	                "Customer Name: " + customer_name + "\n" +
	                "Customer Email: " + customer_email + "\n" +
	                "Customer Phone: " + customer_phone;
	    }
	}


	
