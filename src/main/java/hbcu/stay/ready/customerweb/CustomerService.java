package hbcu.stay.ready.customerweb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.validation.constraints.NotNull;

@Service
public class CustomerService {

    private final Logger logger = LoggerFactory.getLogger(CustomerService.class);



    public Customer create(){
        logger.info("Init");
        Customer customer = new Customer("Teanna Pearson", "pizza", "555555555", new Date(), "teanna@gmail.com", "1700 East Cold Spring Lane", "443885");
        return customer;
    }

}
