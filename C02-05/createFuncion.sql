create function CustomerLevel(
  
    credit DECIMAL(10,2)  

)
returns VARCHAR(20)

DETERMINISTIC

BEGIN 
 
 DECLARE customerLevel VARCHAR(20);
   
   if credit > 50000 then 
       Set customerLevel = 'Platinum';
   ELSEIF (credit >= 50000 AND  credit <= 10000) 
   then 
      set customerLevel = 'Gold';
   elseif credit > 10000 then 
   set  
    customerLevel = 'Silver';
  
  End if;
 
    return (customerLevel);

 END
#############


select * from customers ;

create PROCEDURE GetCustomerLevel(
     in customerNo INT,
     out customerLevel VARCHAR(20)
     )
BEGIN
 
    DECLARE credit DEC(10,2) DEFAULT 0;
   
   
   SELECT
      creditLimit 
      INTO credit
      from customers 
      WHERE customerNumber = customerNo;
 
 
     set customerLevel = CustomerLevel(credit);    
 
  
END

#####  LLAMADA

call GetCustomerLevel(151,@customerLevel);

select @customerLevel;

select @customerLevel;
