
package com.gpay.Googlepay.Repository;
  
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;
  
import com.gpay.Googlepay.entity.GooglepayTransfer;
  
@Repository
public interface GooglepayTransferRepository extends JpaRepository<GooglepayTransfer,Long>{
  
  public GooglepayTransfer save(GooglepayTransfer gpay);
  
  
  
  }
 