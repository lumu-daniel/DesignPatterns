package cs401.lambdas;

import java.util.Collections;
import java.util.List;

import cs401.pojos.City;
import cs401.utils.TopCities;

/**
 * Uses a lambda expression + method reference to sort the list of cities.
 * 
 * @author Salek, Payman
 * @since 1.0
 *
 */
public class CityPopulation5 {

	public static void main(String[] args) {
		List<City> topCities = TopCities.getTopCities();
		
		Collections.sort(topCities, TopCities::comparePopulationHigh2Low);
		
		TopCities.printCities(topCities);
	}
}
