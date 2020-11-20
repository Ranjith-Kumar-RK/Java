package com.heraizen.cj.abstract_classes_and_interfaces.my_iterator;

public class User {

	private String name[] = null;

	User(String arr[]) {
		this.name = arr;
	}

	public MyIterator getIterator() {
		return new UserList();
	}

	class UserList implements MyIterator {

		int i = 0;

		public boolean hasNext() {
			if (i != name.length) {

				return true;
			} else {
				return false;
			}
		}

		@Override
		public String next() {

			String str = name[i];
			i++;
			return str;
		}

		public void view() {
			for (String arr : name) {
				System.out.println(arr);
			}
		}

	}

}
