# SpringBoot-MySQLDemo

Install Community Version of MYSQL Database on your Mac M1.
At the time of installing MYSQL on your Machine, enter the root password and store it somewhere as you will need it at the time of launching mysql on terminal.


Open .zshrc file on your M1 Macbook and add path
export PATH=$PATH:/usr/local/mysql/bin

Save .zshrc file and close the file.

Close the terminal and again open new terminal Window.

To launch MySql Server type the following command on your terminal and press Enter


mysql -u root -p 

It will ask to enter password which you entered at the time of installing MQSQL on your machine.

Enter the password.

Once the password is validated. It will display mysql root window where you can enter SQL command.


Type the following command

show databases;

To create new database type the following command

create database myspringbootdb;


To install UI based MySQL client, download community version of MYSQL Workbench

Connect using username root and password which was set at the time of installing MYSQL server.