package Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer address_id;

	    private String street;

	    private String zipCode;
	    

		public Integer getAddress_id() {
			return address_id;
		}



		public void setAddress_id(Integer address_id) {
			this.address_id = address_id;
		}



		public String getStreet() {
			return street;
		}



		public void setStreet(String street) {
			this.street = street;
		}



		public String getZipCode() {
			return zipCode;
		}



		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}



		@OneToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "student_id", nullable = false)
		private Student student;


		public Address() {}
		
		public Address(Integer address_id, String street, String zipCode) {
			super();
			this.address_id = address_id;
			this.street = street;
			this.zipCode = zipCode;
		}



		@Override
		public String toString() {
			return "Address [address_id=" + address_id + ", street=" + street + ", zipCode=" + zipCode + "]";
		}
	
	    



}	