16s left
Skip to main content
ALL

1
2
3
4
5
6
7
8
8. Popular Location Query
From the data tables, determine the location having the most companies. List the names of the employees who work in that location and the names of their companies. The output should consist of two columns: PEOPLE.NAME COMPANIES.NAME.  The rows may be in any order.

 

Schema
There are 3 tables: PEOPLE, COMPANIES, LOCATIONS.

PEOPLE
Name	Type	Description
ID	STRING	Unique ID of the person.
NAME	STRING	NAME of the person
COMPANY_ID	STRING	ID of the company that person works for.
 

COMPANIES
Name	Type	Description
ID	STRING	Unique ID of the company
NAME	STRING	NAME of the company
LOCATION_ID	STRING	ID of the location of the company
 

LOCATIONS
Name	Type	Description
ID	STRING	Unique ID of the location
NAME	STRING	Name of the location
Sample Data Tables
PEOPLE
ID	NAME	COMPANY_ID
a3c7f250f72e452fa5030d587f14922b	Chris	0734a7703d1d4dab8f87be8396415452
71a1e133e7ca4f128f43eed1f5a3a8bc	Sam	55865e7b74ef46a389a1edb9de030b9c
5a439620490646158bc6dd548ddeab21	Faker	2268c402cdfd48c4a7ee8d3a88c162e0
COMPANIES
ID	NAME	LOCATION_ID
0734a7703d1d4dab8f87be8396415452	Wright-Phillips	e2ec9af444ff4e1aaa0b2f4aa19e7063
55865e7b74ef46a389a1edb9de030b9c	HazardEden	e2ec9af444ff4e1aaa0b2f4aa19e7063
2268c402cdfd48c4a7ee8d3a88c162e0	Palmieri	2268c402cdfd48c4a7ee8d3a88c162e0
LOCATIONS
ID	NAME
e2ec9af444ff4e1aaa0b2f4aa19e7063	Wrightmouth
b927735edd1d4354a0a45d8c22e45a53	New Joseph
 
Sample Output

Chris Wright-Phillips
Sam HazardEden
Explanation

Wrightmouth is the location with the most companies. Chris and Sam work there at the companies listed.