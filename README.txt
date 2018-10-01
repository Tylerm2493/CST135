\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
Tyler Martinez
CST135
First Created Spetember 14, 2018
Edited: September 29,2018 (added milestone2 assignment section and clarified a milestone1 section)
Final Project Vending Machine
This Project can be found at https://github.com/Tylerm2493/CST135
\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

Milestone1:
This project is to make a vending machine.
Curently there are 3 files in the project folder.
File1: Storyboard: Shows a rough sketch of the flow of the vending machine. The input comes from the customer and the output from the vending machine with a prodcut
File2: Product_UML: This document contains a UML for a simple product found in the machine. It lists its name, type, and quantity that is expected to be loaded into the machine.
File3: Dispenser_UML: This document conatins a UML for the dispenser of the machine. It will find the products location using an array. It will then check if the product is there and dispense it. If there is no product it will send an error.



\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

Milestone2:
For the first part I created a class diagram for the products in the vending machine. 
I used astah to help make the UML diagrams and added a screenshot of the completed diagram.
The other files are java classes made based off of the UML diagrams
Products: The main superclass of all the other classes. Contains the setter and getter for the name and price
Drinks: Sub class of products, contains the setter and gettter of fluidOz
Snacks: Sub class of products, contains the setter and gettter of Oz
Gum: Sub class of snacks, contains the setter and gettter of chewy
Candy: Sub class of snacks, contains the setter and gettter of sweet
Chips: Sub class of snacks, contains the setter and gettter of salty