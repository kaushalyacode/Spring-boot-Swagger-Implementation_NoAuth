--PUBLISHED BY :W.A.K HARSHANATH
--DATE         :29/03/2021

--INSERT AUTHORS
insert into Author(author_id,author_name) values ( 1,'MARTIN WIKRAMASINGHE' );
insert into Author(author_id,author_name) values ( 2,'URI BONDEREV' );
insert into Author(author_id,author_name) values ( 3,'LIO THOLSTHOI' );
insert into Author(author_id,author_name) values ( 4,'MAXIM GORKI' );
insert into Author(author_id,author_name) values ( 5,'MARTIN LUTER' );
insert into Author(author_id,author_name) values ( 6,'ATHOR CONENDOIL' );

--INSERT CATEGORYS
insert into Category(category_id,category_name) values ( 1,'war' );
insert into Category(category_id,category_name) values ( 2,'adventur' );
insert into Category(category_id,category_name) values ( 3,'novel' );
insert into Category(category_id,category_name) values ( 4,'ict' );
insert into Category(category_id,category_name) values ( 5,'history' );
insert into Category(category_id,category_name) values ( 6,'statistic' );

--INSERT PUBLISHERS
insert into Publisher(publisher_id,publisher_name) values ( 1,'progress' );
insert into Publisher(publisher_id,publisher_name) values ( 2,'gunasena' );
insert into Publisher(publisher_id,publisher_name) values ( 3,'kurulu' );


--INSERT BOOKS
insert into Book(book_id,book_title,book_isbn,stock_quantity,borrow_quantity,available_quantity,publisher_id,category_id)
values ( 1,'BOOK1','ISBN1',100, 3,97,1,1);
insert into Book(book_id,book_title,book_isbn,stock_quantity,borrow_quantity,available_quantity,publisher_id,category_id)
values ( 2,'BOOK2','ISBN2',100, 2,98,1,1);
insert into Book(book_id,book_title,book_isbn,stock_quantity,borrow_quantity,available_quantity,publisher_id,category_id)
values ( 3,'BOOK3','ISBN3',100, 1,99,1,1);
insert into Book(book_id,book_title,book_isbn,stock_quantity,borrow_quantity,available_quantity,publisher_id,category_id)
values ( 4,'BOOK4','ISBN4',100, 2,98,1,1);
insert into Book(book_id,book_title,book_isbn,stock_quantity,borrow_quantity,available_quantity,publisher_id,category_id)
values ( 5,'BOOK5','ISBN5',100, 2,98,1,1);
--no one borrowed bellow book :test one
insert into Book(book_id,book_title,book_isbn,stock_quantity,borrow_quantity,available_quantity,publisher_id,category_id)
values ( 6,'BOOK6','ISBN6',100, 0,100,1,1);


--INSERT BOOK_AUTHOR
insert into author_book(book_id,author_id) values ( 1,1);
insert into author_book(book_id,author_id) values ( 1,5);
insert into author_book(book_id,author_id) values ( 1,6);
insert into author_book(book_id,author_id) values ( 2,3);
insert into author_book(book_id,author_id) values ( 3,2);
insert into author_book(book_id,author_id) values ( 4,1);
insert into author_book(book_id,author_id) values ( 5,1);
insert into author_book(book_id,author_id) values ( 1,4);
insert into author_book(book_id,author_id) values ( 2,2);
insert into author_book(book_id,author_id) values ( 3,1);
insert into author_book(book_id,author_id) values ( 4,2);
insert into author_book(book_id,author_id) values ( 5,3);

--INSERT SECTIONS
insert into Section(section_id,section_name,return_time_in_hr) values ( 1,'LENDING',336);
insert into Section(section_id,section_name,return_time_in_hr) values ( 2,'REFERENCING',6);


--INSERT BOOK_SECTION
insert into section_book(book_id,section_id) values ( 1,1);
insert into section_book(book_id,section_id) values ( 2,2);
insert into section_book(book_id,section_id) values ( 3,2);
insert into section_book(book_id,section_id) values ( 1,2);
insert into section_book(book_id,section_id) values ( 2,1);
insert into section_book(book_id,section_id) values ( 3,1);
insert into section_book(book_id,section_id) values ( 4,2);
insert into section_book(book_id,section_id) values ( 5,1);



--INSERT STUDENT
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 1,'ST1',1,0,2);
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 2,'ST2',2,2,0);
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 3,'ST3',3,0,1);
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 4,'ST4',4,0,0);
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 5,'ST5',5,0,0);
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 6,'ST6',6,0,0);
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 7,'ST7',7,0,0);
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 8,'ST8',8,0,0);
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 9,'ST9',9,0,0);
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 10,'ST10',10,0,0);
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 11,'ST11',11,0,0);
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 12,'ST12',12,0,0);
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 13,'ST13',13,0,0);
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 14,'ST14',14,0,0);
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 15,'ST15',15,0,0);
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 16,'ST16',16,0,0);
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 17,'ST17',17,0,0);
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 18,'ST18',18,0,0);
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 19,'ST19',19,0,0);
insert into Student(student_id,student_name,student_index_number,lended_book_quantity,reference_book_quantity) values ( 20,'ST120',20,0,0);

--INSERT STAFF
insert into Staff_Member(member_id,memeber_name,memeber_telephone,memeber_nic,lended_book_quantity,reference_book_quantity) values ( 1,'STF1','','123456789V',3,0);
insert into Staff_Member(member_id,memeber_name,memeber_telephone,memeber_nic,lended_book_quantity,reference_book_quantity) values ( 2,'STF2','','223456789V',0,2);
insert into Staff_Member(member_id,memeber_name,memeber_telephone,memeber_nic,lended_book_quantity,reference_book_quantity) values ( 3,'STF3','','323456789V',0,0);
insert into Staff_Member(member_id,memeber_name,memeber_telephone,memeber_nic,lended_book_quantity,reference_book_quantity) values ( 4,'STF4','','223406789V',0,0);

--INSERT REFERENCING
insert into Reference_book_operation_details(referencing_id,reference_book_issued_date,reference_book_due_date,Book_id,staff_memeber_id)
values ( 1,'2008-11-11 13:23:44','2008-11-11 13:23:44',1,2);
insert into Reference_book_operation_details(referencing_id,reference_book_issued_date,reference_book_due_date,Book_id,staff_memeber_id)
values ( 2,'2008-11-11 13:23:44','2008-11-11 13:23:44',1,2);
insert into Reference_book_operation_details(referencing_id,reference_book_issued_date,reference_book_due_date,Book_id,student_id)
values ( 3,'2008-11-11 13:23:44','2008-11-11 13:23:44',2,1);
insert into Reference_book_operation_details(referencing_id,reference_book_issued_date,reference_book_due_date,Book_id,student_id)
values ( 4,'2008-11-11 13:23:44','2008-11-11 13:23:44',2,1);
insert into Reference_book_operation_details(referencing_id,reference_book_issued_date,reference_book_due_date,Book_id,student_id)
values ( 5,'2008-11-11 13:23:44','2008-11-11 13:23:44',5,3);

--INSERT LENDING
insert into Lending_book_operation_details(lending_id,lending_book_issued_date,lending_book_due_date,Book_id,student_id)
values ( 1,'2008-11-11 13:23:44','2008-11-11 13:23:44',3,2);
insert into Lending_book_operation_details(lending_id,lending_book_issued_date,lending_book_due_date,Book_id,student_id)
values ( 2,'2008-11-11 13:23:44','2008-11-11 13:23:44',4,2);
insert into Lending_book_operation_details(lending_id,lending_book_issued_date,lending_book_due_date,Book_id,staff_memeber_id)
values ( 3,'2008-11-11 13:23:44','2008-11-11 13:23:44',5,1);
insert into Lending_book_operation_details(lending_id,lending_book_issued_date,lending_book_due_date,Book_id,staff_memeber_id)
values ( 4,'2008-11-11 13:23:44','2008-11-11 13:23:44',4,1);
insert into Lending_book_operation_details(lending_id,lending_book_issued_date,lending_book_due_date,Book_id,staff_memeber_id)
values ( 5,'2008-11-11 13:23:44','2008-11-11 13:23:44',1,1);