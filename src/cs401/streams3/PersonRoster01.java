package cs401.streams3;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import cs401.pojos.Employee;
import cs401.pojos.Person;
import cs401.pojos.Person.Gender;
import cs401.utils.PersonUtils;

/**
 * Pipelines and Streams: Aggregate Operations
 * 
 * @author Salek, Payman
 * @since 1.0
 *
 */
public class PersonRoster01 {

	public static void main(String[] args) {
		List<Person> roster = PersonUtils.generateRandomPersonList(100);
		
		Employee e = new Employee(null, null);
		roster.add(e);

		Function<Person, Gender> function = 
				p -> {
					if(p.getGender() == Gender.MALE) {
						return Gender.MALE;
					}
					else {
						return null;
					}
				};
		System.out.println("List of genders in the roster:" + mapList(roster, function));

	}
	
	public static List<Gender> mapList(List<Person> list, Function<Person, Gender> function) {
		return list.stream().map(function).collect(Collectors.toList());
	}


}
