package cs401.streams2;

import java.util.List;

import cs401.pojos.Person;
import cs401.utils.PersonUtils;

/**
 * Pipelines and Streams: Reduction average() is a reduction operation
 * 
 * 
 * @author Salek, Payman
 * @since 1.0
 *
 */
public class PersonRoster04 {

	public static void main(String[] args) {
		List<Person> roster = PersonUtils.generateRandomPersonList(100000);

		double averageAge = roster
				.stream()
				.filter(p -> p.getGender() == Person.Gender.MALE)
				.mapToInt(Person::getAge)
				.average()
				.getAsDouble();

		System.out.printf("Average age of all MALE persons in the roster: %.2f", averageAge);
	}

}
