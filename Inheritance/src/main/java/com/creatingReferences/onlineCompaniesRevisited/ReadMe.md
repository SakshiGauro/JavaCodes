# Online Companies Revisited
For this problem, we are going to revisit the Online Company exercise from lesson 3. In lesson 3, we created 3 classes, a superclass `Company`, a subclass `OnlineCompany` and a runner class `CompanyTester`. 

Your task is to create a loop that will allow users to enter companies that will then get stored in an ArrayList. You should first prompt users for the company name. If the user enters `exit`, then the program should exit and print the object using the toString.

After prompting for the name, you prompt the user if it is an online company. If so, ask for a website address, otherwise ask for the street address, city, and state. You will then create the `Company` or `OnlineCompany` object and insert it into the ArrayList.

###Sample output:
```
Please enter a company name, enter 'exit' to quit: CodeHS
Is this an online company, 'yes' or 'no': yes
Please enter the website address: www.codehs.com
Please enter a company name, enter 'exit' to quit: Uber
Is this an online company, 'yes' or 'no': no
Please enter the street address: 555 Market Street
Please enter the city address: San Fransisco
Please enter the state address: CA
Please enter a company name, enter 'exit' to quit: exit

CodeHS
Website: www.codehs.com

Uber
555 Market Street
San Fransisco, CA
```
