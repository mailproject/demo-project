package com.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class ViewModel {

	private List<PersonModel> persionList = new ArrayList<PersonModel>();
	{
		persionList.add(new PersonModel("Anderson", "office", "12-03-14"));
		persionList.add(new PersonModel("Mike", "office", "12-03-14"));
		persionList.add(new PersonModel("Song", "office", "12-03-14"));
		persionList.add(new PersonModel("Song1", "office", "12-03-14"));
	}

	public List<PersonModel> getPeople() {
		return persionList;
	}
}
