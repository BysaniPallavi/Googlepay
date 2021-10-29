package com.gpay.Googlepay.Repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gpay.Googlepay.entity.Googlepay;
import com.gpay.Googlepay.entity.GooglepayTransfer;



@Repository
public interface GooglepayRepository extends JpaRepository<Googlepay,Long>{
	
	public Googlepay findByPhoneEquals(String phone);
	
	/*
	 * @Transactional
	 * 
	 * @Modifying(clearAutomatically = true)
	 * 
	 * @Query("UPDATE Googlepay c SET c.initialAmount = :initialAmount WHERE c.phone"
	 * ) public void UpdateGooglepay(@Param ("phone") String
	 * phone, @Param("initialAmount") int initialAmount);
	 */
	public Googlepay save(Googlepay gpay);
	
	@Query("select c from GooglepayTransfer c WHERE c.fromPhoneNumber = :fromPhoneNumber")
	  public List<GooglepayTransfer> generateStatement(@Param("fromPhoneNumber") String fromPhoneNumber, Pageable paging);
	  
	  
	
}
