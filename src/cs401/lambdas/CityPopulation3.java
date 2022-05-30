package cs401.lambdas;

import java.util.Collections;
import java.util.List;

import cs401.pojos.City;
import cs401.utils.TopCities;

/**
 * Uses a lambda expression to sort the list of cities.
 * 
 * @author Salek, Payman
 * @since 1.0
 *
 */
public class CityPopulation3 {

	public static void main(String[] args) {
		List<City> topCities = TopCities.getTopCities();
		
		Collections.sort(topCities, (c1, c2) -> c2.getPopulation() - c1.getPopulation());
		
		TopCities.printCities(topCities);
	}
}
