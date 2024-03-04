package in.harsha.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Table(name="PRODUCT_DETAILS")
@Entity
public class UserEntity {
	@Id
	@Column(name="PRODUCT_ID")
	private Integer pid;
	@Column(name="PRODUCT_NAME")
	private String pname;
	@Column(name="PRODUCT_PRICE")
	private Double price;
	@CreationTimestamp
	@Column(name="CREATED_DATE",updatable = false)
	private LocalDate cdate;
	@UpdateTimestamp
	@Column(name="UPDATED_DATE",insertable = false)
	private LocalDate udate;

}
