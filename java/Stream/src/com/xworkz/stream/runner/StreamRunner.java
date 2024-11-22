package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamRunner {
	public static void main(String[] args) {

		Collection<Long> collection = new ArrayList<Long>();
		collection.add(8105869581L);
		collection.add(9480420078L);
		collection.add(9731276272L);
		collection.add(9591868323L);
		collection.add(8956784321L);
		collection.add(9731276273L);
		collection.add(9591868332L);
		collection.add(7896453782L);
		collection.add(8984275322L);
		collection.add(9845673218L);
		collection.forEach((ref1) -> System.out.println(ref1));
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("ascending order of phone no");
		collection.stream().sorted().collect(Collectors.toList()).forEach((ref) -> System.out.println(ref));
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("descending order of phone no");
		collection.stream().sorted((ref1, ref2) -> ref2.compareTo(ref1)).collect(Collectors.toList())
				.forEach((ref) -> System.out.println(ref));
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("descending1 order");
		collection.stream().sorted((ref1, ref2) -> {
			if (ref2 > ref1)
				return 1;
			else if (ref2 < ref1)
				return -1;
			return 0;
		}).collect(Collectors.toList()).forEach((ref) -> System.out.println(ref));

		System.out.println("========================================================================");

		Collection<String> collection1 = new ArrayList<String>();
		collection1.add("Nehru");
		collection1.add("Gulzarilal Nanda");
		collection1.add("Lal Bahadur Shastri");
		collection1.add("Indira Gandhi");
		collection1.add("Morarji Desai");
		collection1.add("Charan Singh");
		collection1.add("Rajiv Gandhi");
		collection1.add("V.P.Singh");
		collection1.add("Chandra Shekhar");
		collection1.add("Narasimha Rao");
		collection1.add("Atal Bihari Vajpayee");
		collection1.add("Deve Gowda");
		collection1.add("Inder Kumar Gujral");
		collection1.add("Manmohan Singh");
		collection1.add("Narendra modi");
		collection1.forEach((ref1) -> System.out.println(ref1));
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("ascending order of pm");
		collection1.stream().sorted().collect(Collectors.toList()).forEach((ref) -> System.out.println(ref));
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("descending order of pm");
		collection1.stream().sorted((ref1, ref2) -> ref2.compareTo(ref1)).collect(Collectors.toList())
				.forEach((ref) -> System.out.println(ref));

		System.out.println("================================================================================");

		Collection<String> collection2 = new ArrayList<String>();
		collection2.add("Goa");
		collection2.add("Karnataka");
		collection2.add("Assam");
		collection2.add("Bihar");
		collection2.add("Haryana");
		collection2.add("Andhra pradesh");
		collection2.add("Arunachal Pradesh");
		collection2.add("Jhaarkhand");
		collection2.add("Gujarat");
		collection2.add("Kerala");
		collection2.add("Madhya Pradesh");
		collection2.add("Himachal Pradesh");
		collection2.add("Chattisgarh");
		collection2.add("Maharashtra");
		collection2.add("Manipur");
		collection2.add("Nagaland");
		collection2.add("Megalaya");
		collection2.add("Sikkim");
		collection2.add("Tamil Nadu");
		collection2.add("Telangana");
		collection2.add("Odisa");
		collection2.add("Mizoram");
		collection2.add("Tripura");
		collection2.add("West Bengal");
		collection2.add("Uttarkhand");
		collection2.add("Uttar Pradesh");
		collection2.add("Rajasthan");
		collection2.add("Punjab");
		collection2.forEach((ref1) -> System.out.println(ref1));
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("ascending order states");
		collection1.stream().sorted().collect(Collectors.toList()).forEach((ref) -> System.out.println(ref));
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("descending order states");
		collection2.stream().sorted((ref1, ref2) -> ref2.compareTo(ref1)).collect(Collectors.toList())
				.forEach((ref) -> System.out.println(ref));

	}

}
