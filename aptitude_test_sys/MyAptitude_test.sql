create database db_ATS
go

use db_ATS
go

create table register(s_id int identity,s_name varchar(50),s_age int,s_phone varchar(50),last_qualification varchar(50),subject_name varchar(50),date varchar(50))
go
select * from register

create table results(r_id int identity,s_name varchar(50),subject_name varchar(50),total_que int,total_marks int,marks_obt int,percentage int,grade varchar(50),date varchar(50))
go
select * from results

create table admin(a_id int identity,userName varchar(50),password varchar(50))
go
insert into admin values('admin','admin123')
go
select * from admin

create table subject(subject_id int identity,subject_name varchar(50) unique)
go


insert into subject values('General IT')
insert into subject values('PHP')
insert into subject values('JAVA')
insert into subject values('.NET')
insert into subject values('ACCP')
go

select * from subject

create table question(q_id int identity,q_name varchar(500),option_1 varchar(500),option_2 varchar(500),option_3 varchar(500),option_4 varchar(500),answer varchar(500),subject_name varchar(500))
go
select * from question

/*General IT*/
insert into question values('In which decade was the American Institute of Electrical Engineers (AIEE) founded?','1850s','1880s','1930s','1950s','1850s','General IT')
insert into question values('What is part of a database that holds only one type of information?','Report','Field','Record','File','File','General IT')
insert into question values('"OS" computer abbreviation usually means ?','Order of Significance','Open Software','Operating System','Optical Sensor','Optical Sensor','General IT')
insert into question values('In which decade with the first transatlantic radio broadcast occur?','1850s','1860s','1870s','1900s','1860s','General IT')
insert into question values('".MOV" extension refers usually to what kind of file?','Image file','Animation/movie file','Audio file','MS Office document','Audio file','General IT')
insert into question values('In which decade was the SPICE simulator introduced?','1950s','1960s','1970s','1980s','1980s','General IT')
insert into question values('Most modern TV"s draw power even if turned off. The circuit the power is used in does what function?','Sound','Remote control','Color balance','High voltage','Sound','General IT')
insert into question values('Which is a type of Electrically-Erasable Programmable Read-Only Memory?','Flash','Flange','Fury','FRAM','Flange','General IT')
insert into question values('The purpose of choke in tube light is ?','To decrease the current','To increase the current','To decrease the voltage momentarily','To increase the voltage momentarily','To decrease the voltage momentarily','General IT')
insert into question values('".MPG" extension refers usually to what kind of file?','WordPerfect Document file','MS Office document','Animation/movie file','Image file','Image file','General IT')
insert into question values('Who is largely responsible for breaking the German Enigma codes, created a test that provided a foundation for artificial intelligence?','Alan Turing','Jeff Bezos','George Boole','Charles Babbage','Alan Turing','General IT')
insert into question values('Who developed Yahoo?','Dennis Ritchie & Ken Thompson','David Filo & Jerry Yang','Vint Cerf & Robert Kahn','Steve Case & Jeff Bezos','David Filo & Jerry Yang','General IT')
insert into question values('Made from a variety of materials, such as carbon, which inhibits the flow of current?','Choke','Inductor','Resistor','Capacitor','Resistor','General IT')
insert into question values('The most common format for a home video recorder is VHS. VHS stands for...?','Video Home System','Very high speed','Video horizontal standard','Voltage house standard','Voltage house standard','General IT')
insert into question values('What does VVVF stand for?','Variant Voltage Vile Frequency','Variable Velocity Variable Fun','Very Very Vicious Frequency','Variable Voltage Variable Frequency','Variant Voltage Vile Frequency','General IT')

/*PHP*/
insert into question values('Which of following are compound data type?','Array','Objects','Both','None','Array','PHP')
insert into question values('The difference between include() and require() ','is include() produced a Fatal Error while require results in a Warning','both are same in every aspects','are different how they handle failure','None of above','both are same in every aspects','PHP')
insert into question values('Which function includes the specified file even the statement evaluates to false in which block the function is placed.','include()','require()','both of above','none of above','both of above','PHP')
insert into question values('The PHP syntax is most similar to','PERL and C','Java script','VB Script','Visual Basic','Visual Basic','PHP')
insert into question values('Identify the invalid identifier','â??some word','size','my-function','This&that','â??some word','PHP')
insert into question values('script is a','Program or sequence of instruction that is interpreted or carried out by web server only','Program or sequence of instruction that is interpreted or carried out by another program','Program or sequence of instructions that is interpreted or carried out by processor directly','None of above','Program or sequence of instruction that is interpreted or carried out by another program','PHP')
insert into question values('Which of the following functions can be used to determine the integrity of a string?','md5()','sha1()','crc32()','all of the above','crc32()','PHP')
insert into question values('Which of the following PCRE regular expressions best matches the string php|architect?','\d{3}\|\d{8}','[a-z][a-z][a-z]\|\w{9}','[az]{3}\|[az]{9}','.*','.*','PHP')
insert into question values('Which of following variable assignment is "by value" assignment in PHP ?','$value1= $value?','$value1= # $value?','$value1= & $value?','None','$value1= $value?','PHP')
insert into question values('What is the expansion of LAMP?','Linux And Mysql Php','Linux Apache Mysql Php','both of above','none of above','Linux Apache Mysql Php','PHP')
insert into question values('Father of PHP?','Larry Wall','Rasmus Lerdorf','James Gosling','Guido Van Rossum','James Gosling','PHP')
insert into question values('When you need to obtain the ASCII value of a character which of the following function you apply in PHP?','asc( );','ord( );','chr( );','val( );','val( );','PHP')
insert into question values('Are there regular expressions in PHP?','Yes - regular expressions use Perl-like conventions','Yes - PHP supports two different types of regular expressions: POSIX-extended and Perl-Compatible Regular Expressions (PCRE).','Yes - regular expressions use the POSIX standard','No - PHP uses "glob" style matching only','Yes - regular expressions use Perl-like conventions','PHP')
insert into question values('How would you add 1 to the variable $count?','incr count;','$count =+1','$count++;','incr $count;','$count =+1','PHP')
insert into question values('What is the out put ? <?php $x=array("aaa","ttt","www","ttt","yyy","tttt"); $y=array_count_values($x); echo $y[ttt]; ?>','2','3','1','4','1','PHP')

/*JAVA*/
insert into question values('TreeMap class is used to implement which collection interface. Select the one correct answer.','Set','Sortedset','Tree','SortedMap','Set','JAVA')
insert into question values('By using which modifier we can prevent from overridden?','final','static','we can prevent','by default it provides','static','JAVA')
insert into question values('Using up to four characters, write the Java representation of integer literal 3 in hexadecimal.','0x03, 0X03, 0X3','0x04, 0X04, 0X4','0x05, 0X05, 0X5','none of these','0x05, 0X05, 0X5','JAVA')
insert into question values('What gets written on the screen when the following program is compiled and run. Select the one right answer.
public class test {
   public static void main(String args[]) { 
   int i;
   float  f = 2.3f;
   double d = 2.7;
   i = ((int)Math.ceil(f)) * ((int)Math.round(d));
 
   System.out.println(i);
   }
}','4','5','6','9','9','JAVA')
insert into question values('Which of these is a legal definition of a method named m assuming it throws IOException, and returns void. Also assume that the method does not take any arguments. Select the one correct answer.','void m() throws IOException{}','void m() throw IOException{}','void m(void) throws IOException{}','void m() {} throws IOException','void m() throws IOException{}','JAVA')
insert into question values('Which statement about static inner class is true?','A static inner class does not require an instance of the enclosing class.','A static inner class cannot be a static member of outer class.','It must extend enclosing class.','Itâ??s variables and methods must be static.','A static inner class cannot be a static member of outer class.','JAVA')
insert into question values('Which of the following statements declare class Sample to belong to the payroll.admindept package?','package payroll;package admindept;','package payroll.admindept.Sample;','package payroll.admindept;','import payroll.admindept.*','package payroll.admindept;','JAVA')
insert into question values('Which cannot directly cause a thread to stop executing?','Calling the notify method on an object.','Calling the start method on another Thread object.','Calling a yield method.','Calling wait method on an object.','Calling wait method on an object.','JAVA')
insert into question values('If result = 2 + 3 * 5, what is the value and type of â??resultâ?? variable?','17, byte','25, byte','17, int','25, int','17, byte','JAVA')
insert into question values('Select the one most appropriate answer. What is the purpose of method parseInt defined in Integer class.','The method converts an integer to a String.','The method is used to convert String to an integer, assuming that the String represents an integer.','The method is used to convert String to Integer class, assuming that the String represents an integer.','The method converts the Integer object to a String.','The method is used to convert String to an integer, assuming that the String represents an integer.','JAVA')
insert into question values('The initial value of an instance variable of type String that is not explicitly initialized in the program is --. Select the one correct answer. ','null','""','NULL','The instance variable must be explicitly assigned.','NULL','JAVA')
insert into question values('public Class Test implements Runnable
{
public void run(Thread t)
{
System.out.println("Running...");
}
public static void main(String [] args)
{
new thread(new Test()).start();
}
}
What is the result?
','Exception is thrown.','Running... will be printed','Compile error.','Program exists without printing anything.','Program exists without printing anything.','JAVA')
insert into question values('Which statement is true?','ArrayList is a sub class of Vector','HashTable is a sub class of Dictionary','LinkedList is a subclass of ArrayList','Vector is a subclass of Stack','ArrayList is a sub class of Vector','JAVA')
insert into question values('What are the two parts of a value of type double?','Length, Denominator','Significant Digits, Exponent','Mode, Numerator','Length, Numerator','Significant Digits, Exponent','JAVA')
insert into question values('Which keyword when applied on a method indicates that only one thread should execute the method at a time. Select the one correct answer.','transient','volatile','synchronized','native','synchronized','JAVA')

/*.NET*/
insert into question values('What is the Server.MachineName does','Gets the Server"s Machine Name','Gets the Referred Web site name on the server','Gets the Client Machine Name','None of the above','Gets the Server"s Machine Name','.NET')
insert into question values('Where we can assign value to Static read only member variable of a static class?','Default constructor','Parameterized constructor','Global.asax','On click of button','Parameterized constructor','.NET')
insert into question values('While writing code in Visual Studio 2005 you creates a new instance of a ASP.NET TextBox server control, what do you need to do to get the TextBox to display on the Web page?','Call the ShowControl method on the TextBox.','Add the TextBox instance to the form1.Controls collection.','Execute the AddControl method on the Web page.','Set the VisibleControl to true on the TextBox.','Execute the AddControl method on the Web page.','.NET')
insert into question values('While developing ASP.NET 2.0 web application you have a Data Set containing a Customer Data Table and an Order Data Table. You want to easily navigate from an Order Data Row to the Customer who placed the order. What object will allow you to easily navigate from the Order to the Customer?','The Data Column object','The Data Table object','The Data Row object','The Data Relation object','The Data Relation object','.NET')
insert into question values('Where do we include the user lists for Form authentication?','< credential>','< authorization>','< Identity>','< authentication>','< credential>','.NET')
insert into question values('Which one of the following is the fastest way to concat strings in ASP.NET?','Concat method of the String object','Append method of the StringBuilder object','Plus sign operator to concatenate the strings','Substring method of the String object','Append method of the StringBuilder object','.NET')
insert into question values('Which of the following is the performance attributes of processModel?','requestQueue limit','maxWorkerThreads','maxIdThreads','All','maxIdThreads','.NET')
insert into question values('Which Kind Of data we can store in viewstate','Viewstate can store anything','Viewstate can store onlys string','Viewstate can store only serilizable object','None','None','.NET')
insert into question values('Which of the following is not the way to maintain state?','View state','Cookies','Hidden fields','Request object','View state','.NET')
insert into question values('What is the out put of Following code String a="Hello"; String b="World" String c= a+b Response.Write ( "C ");','Hello World','C','a+b','None of above','C','.NET')
insert into question values('What is a connection object?','Specifies whether to use a DSN or DSN-less connection','Specifies which type of database is being used','Specifies the type of driver to use, database format and filename','First opens the initial connection to a database before giving any database information','Specifies the type of driver to use, database format and filename','.NET')
insert into question values('Which of the following is not a member of ADODBCommand object?','ExecuteReader','ExecuteScalar','ExecuteStream','Open','Open','.NET')
insert into question values('How do we Delete, Update, Select data in a Dataset','Using SQLDataAdapter','Using SQLDataReader','Using SQLCommand','None','Using SQLDataAdapter','.NET')
insert into question values('ASP is an acronym for what?','Active Server Protocol','ActiveX Server Pages','Active Setup Pages','Active Server Pages','ActiveX Server Pages','.NET')
insert into question values('Default scripting language in ASP?','EcmaScript','VBScript','PERL','JavaScript','PERL','.NET')

/*ACCP*/
insert into question values('What is part of a database that holds only one type of information?','Report','Field','Record','File','File','ACCP')
insert into question values('Which of following are compound data type?','Array','Objects','Both','None','Array','ACCP')
insert into question values('TreeMap class is used to implement which collection interface. Select the one correct answer.','Set','Sortedset','Tree','SortedMap','Set','ACCP')
insert into question values('What is the Server.MachineName does','Gets the Server"s Machine Name','Gets the Referred Web site name on the server','Gets the Client Machine Name','None of the above','Gets the Server"s Machine Name','ACCP')
insert into question values('What is part of a database that holds only one type of information?','Report','Field','Record','File','File','ACCP')
insert into question values('Where we can assign value to Static read only member variable of a static class?','Default constructor','Parameterized constructor','Global.asax','On click of button','Parameterized constructor','ACCP')
insert into question values('By using which modifier we can prevent from overridden?','final','static','we can prevent','by default it provides','static','ACCP')
insert into question values('The difference between include() and require() ','is include() produced a Fatal Error while require results in a Warning','both are same in every aspects','are different how they handle failure','None of above','both are same in every aspects','ACCP')
insert into question values('Where do we include the user lists for Form authentication?','< credential>','< authorization>','< Identity>','< authentication>','< credential>','ACCP')
insert into question values('What are the two parts of a value of type double?','Length, Denominator','Significant Digits, Exponent','Mode, Numerator','Length, Numerator','Significant Digits, Exponent','ACCP')
insert into question values('Father of PHP?','Larry Wall','Rasmus Lerdorf','James Gosling','Guido Van Rossum','James Gosling','ACCP')
insert into question values('Made from a variety of materials, such as carbon, which inhibits the flow of current?','Choke','Inductor','Resistor','Capacitor','Resistor','ACCP')
insert into question values('Which of the following is not a member of ADODBCommand object?','ExecuteReader','ExecuteScalar','ExecuteStream','Open','Open','ACCP')
insert into question values('Identify the invalid identifier','â??some word','size','my-function','This&that','â??some word','ACCP')
insert into question values('If result = 2 + 3 * 5, what is the value and type of â??resultâ?? variable?','17, byte','25, byte','17, int','25, int','17, byte','ACCP')