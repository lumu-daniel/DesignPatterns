package cs401.streams1;

import java.util.List;

import cs401.pojos.City;
import cs401.utils.TopCities;

/**
 * Uses Stream API to calculate the total population of top 50 US cities.
 * 
 * @author Salek, Payman
 * @since 1.0
 *
 */
public class CityPopulation9 {

	public static void main(String[] args) {
		List<City> topCities = TopCities.getTopCities();
		
		Integer totalPopulation = topCities
				.stream()
				.mapToInt(c -> c.getPopulation())
				.reduce(0, Integer::sum);
		
		System.out.printf("\nTotal population of top 50 US cities is %,d", totalPopulation);
		
	}
}
