package Main;

import java.math.BigDecimal;

import Entity.Rental;



public interface RentalCostCalculator {

	BigDecimal calculateRentalCost(Rental rental);
	
}
