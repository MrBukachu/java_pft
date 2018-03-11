package ru.stqa.pft.addressbook.model;

public class UserData {
	private final String firstname;
	private final String middlename;
	private final String lastname;
	private final String nickname;
	private final String title;
	private final String address;
	private final String home_phone;
	private final String mobile_phone;
	private final String work_phone;
	private final String fax;
	private final String email;
	private final String email2;
	private final String email3;
	private final String homepage;
	private final String bday;
	private final String bmonth;
	private final String byear;
	private final String aday;
	private final String amonth;
	private final String ayar;
	private final String address2;
	private final String phone2;
	private final String notes;

	public UserData(String firstname, String middlename, String lastname, String nickname, String title, String address, String home_phone, String mobile_phone, String work_phone, String fax, String email, String email2, String email3, String homepage, String bday, String bmonth, String byear, String aday, String amonth, String ayar, String address2, String phone2, String notes) {
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.nickname = nickname;
		this.title = title;
		this.address = address;
		this.home_phone = home_phone;
		this.mobile_phone = mobile_phone;
		this.work_phone = work_phone;
		this.fax = fax;
		this.email = email;
		this.email2 = email2;
		this.email3 = email3;
		this.homepage = homepage;
		this.bday = bday;
		this.bmonth = bmonth;
		this.byear = byear;
		this.aday = aday;
		this.amonth = amonth;
		this.ayar = ayar;
		this.address2 = address2;
		this.phone2 = phone2;
		this.notes = notes;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public String getNickname() {
		return nickname;
	}

	public String getTitle() {
		return title;
	}

	public String getAddress() {
		return address;
	}

	public String getHome_phone() {
		return home_phone;
	}

	public String getMobile_phone() {
		return mobile_phone;
	}

	public String getWork_phone() {
		return work_phone;
	}

	public String getFax() {
		return fax;
	}

	public String getEmail() {
		return email;
	}

	public String getEmail2() {
		return email2;
	}

	public String getEmail3() {
		return email3;
	}

	public String getHomepage() {
		return homepage;
	}

	public String getBday() {
		return bday;
	}

	public String getBmonth() {
		return bmonth;
	}

	public String getByear() {
		return byear;
	}

	public String getAday() {
		return aday;
	}

	public String getAmonth() {
		return amonth;
	}

	public String getAyar() {
		return ayar;
	}

	public String getAddress2() {
		return address2;
	}

	public String getPhone2() {
		return phone2;
	}

	public String getNotes() {
		return notes;
	}
}
