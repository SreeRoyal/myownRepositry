create table hays_Employee (
	employeeId LONG not null primary key,
	employeeName VARCHAR(75) null,
	designation VARCHAR(75) null,
	address VARCHAR(75) null,
	mobileNumber VARCHAR(75) null,
	emailAddress VARCHAR(75) null,
	userId LONG,
	userName VARCHAR(75) null,
	companyId LONG,
	groupId LONG,
	createdDate DATE null,
	modifiedDate DATE null
);

create table hays_SreeSoluctions (
	soluctionId LONG not null primary key,
	branchId VARCHAR(75) null,
	branchAddress VARCHAR(75) null,
	telephoneNumber VARCHAR(75) null,
	officeEmailAddress VARCHAR(75) null,
	employeeId LONG
);