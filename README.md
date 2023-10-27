# HSAP_JavaRMI_RAM_Summer2020
Hello! My name is Karthik Ramakrishnan, and I am a student at the University of North Carolina at Chapel Hill majoring in Biomedical Engineering. This repository contains most of my work (I could not upload some of my preliminary work due to that having over 100 files) from the summer of 2020 working with the RARE (Remote And Reconfigurable Environment) research group at North Carolina A&T State University on a Reconfigurable Resource Allocation Manager (RAM). All of the programs in this repository deal with adding doubles in some way. I was afforded this opportunity as part of the High School Apprenticeship Program (HSAP), a program funded by the Army Research Office (ARO).

## Contents
I have included the following: <br/>

[Contact Information](https://github.com/K-Ramki/HSAP_JavaRMI_RAM_Summer2020#contact-information) <br/>
[How to make a basic Java RMI program](https://github.com/K-Ramki/HSAP_JavaRMI_RAM_Summer2020#how-to-make-a-basic-java-rmi-program) <br/>
[TwoComputers](https://github.com/K-Ramki/HSAP_JavaRMI_RAM_Summer2020#twocomputers) <br/>
[ThreeComputers](https://github.com/K-Ramki/HSAP_JavaRMI_RAM_Summer2020#threecomputers) <br/>
[FourComputers](https://github.com/K-Ramki/HSAP_JavaRMI_RAM_Summer2020#fourcomputers) <br/>
[TwoServersTwoClients](https://github.com/K-Ramki/HSAP_JavaRMI_RAM_Summer2020#twoclientstwoservers) <br/>
[License](https://github.com/K-Ramki/HSAP_JavaRMI_RAM_Summer2020#license)

## Contact Information
For any questions, please email me at **karthik.ramki.rdu@gmail.com** and I'll try to get back to you within two weeks. The format of the email should be as follows:<br/>
**(First and Last Name) - (Category Folder) - (Program Folder) as well as a program and a line number (if you can).**
I'll put an example:<br/>
*John Doe - TwoServersTwoClients - VersionTwo_SelfSufficient - FI.java - 9*
(again the "- FI.java - 9" is OPTIONAL BUT RECOMMENDED)

If this format is not followed, I cannot respond.

## How to make a basic Java RMI program
I have linked the tutorials that I used to learn Java RMI:
* [tutorialspoint](https://www.tutorialspoint.com/java_rmi/java_rmi_introduction.htm) <br/>
* [Oracle](https://docs.oracle.com/javase/tutorial/rmi/) <br/>
* [LocateRegistry method (especially important if the user wants to use multiple computers)](https://docs.oracle.com/javase/7/docs/api/java/rmi/registry/LocateRegistry.html)

## TwoComputers
The programs in this category folder are meant to run on two computers: a server and a client. The server should be initialized first and then the client. The files with the "SelfSufficient" label can run on one computer. <br/>

Note: if a program folder has a file named FileInputThing.java, do not panic. This file is just for reading .txt files that are populated with user values that will then be added by the server and returned to the client. All you need to do is change the filepath of the .txt file. Do *not* initialize this file.

## ThreeComputers
The programs in this category folder are meant to run on three computers: a server, a client, and a RAM. The server should be initialized first, then the RAM, and finally, the client. The files with the "SelfSufficient" label can run on one computer.

## FourComputers
The programs in this category folder are meant to run on four computers: two servers, a client, and a RAM. The servers should be initialized first (the order of server initialization doesn't matter), then the RAM, and finally, the client. The files with the "SelfSufficient" label can run on one computer.

## TwoClientsTwoServers
The programs in this category folder are meant to run on five computers: two servers, two clients, and a RAM. The servers should be initialized first (the order of server initialization doesn't matter), then the RAM, and finally, the clients (the order of client initialization doesn't matter). The files with the "SelfSufficient" label can run on one computer.

Notes: 
* The programs in this category folder were all programmed to be run on one computer as I did not have access to five separate computers. The user can modify these programs to work on five computers. <br/>
* If a program folder has a file named FI.java, do not panic. This file is just for reading .txt files that are populated with user values that will then be added by the server and returned to the client. All you need to do is change the filepath of the .txt file. Do *not* initialize this file. <br/>
* The "VersionOne_SelfSufficient_Bad" folder does not work as intended and as such, the user will not gain anything if they choose to compile and run it.

## License
[MIT](https://github.com/K-Ramki/HSAP_JavaRMI_RAM_Summer2020/blob/master/LICENSE)
