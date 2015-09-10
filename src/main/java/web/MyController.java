package web;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
	
	@RequestMapping("/hello")
	String index() {
		return "Hello World!";
	}
        
        @RequestMapping("/vat/{price}")
        double tax( @PathVariable double price){
            return price *7/100;
        }        
        @RequestMapping("/area")
        double area( double width, double height){
            return width*height;
        }
        
        @RequestMapping("/zipcode/{ampher1}")
	String zipcode(@PathVariable String ampher1 ) {
		String zipcode1="99999";     // zip code

                if ( ampher1.equals( "เมืองนนทบุรี" )){ zipcode1="11000"; }
                if ( ampher1.equals( "บางบัวทอง" )){ zipcode1="11110"; }
                if ( ampher1.equals( "ปากเกร็ด" )){ zipcode1="11120"; }
                if ( ampher1.equals( "บางกรวย" )){ zipcode1="11130"; }
                if ( ampher1.equals( "บางใหญ่" )){ zipcode1="11140"; }
                if ( ampher1.equals( "ไทรน้อย" )){ zipcode1="11150"; }

		return zipcode1;
	}
        
        @RequestMapping("/vat/{cc1}/{seat1}")
        double tax( @PathVariable int cc1, @PathVariable int seat1){
            return 0.75*cc1+seat1*70;
        }
        
        @RequestMapping("/soulmate/{name1}/{name2}")
        String tax( @PathVariable String name1, @PathVariable String name2){
            if(name1.length()==name2.length()){
                return "Yes, they're matched";
            } else {
                return "Yes, they're not";
            }
         
                
            
        }
        
}

