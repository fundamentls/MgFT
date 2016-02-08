﻿# MgFT

Welcome to the Java project intended to test a shop.

Simple steps and preparations have been made.

Please take into account that this is a proof of concept, and the time invested in it was according to such.

### Version
0.0.1

### Tech

This project uses a few dependecies.

Maven is most advised, since the project was created as such.
IntelliJ IDEA is also advised.
Specific plugins for Cucumber are a most, according to your IDE. Use them to run the project.

This project focus on Chrome execution, though it can handle Firefox too.
ChromeDriver is able to run on Windows and Linux. Further OS can be added later on.

ChromeDriver should be installed using following procedure:

```sh
$ sudo apt-get install unzip
$ wget -N http://chromedriver.storage.googleapis.com/2.10/chromedriver_linux64.zip -P ~/Downloads
$ unzip ~/Downloads/chromedriver_linux64.zip -d ~/Downloads
$ chmod +x ~/Downloads/chromedriver
$ sudo mv -f ~/Downloads/chromedriver /usr/local/share/chromedriver
```

Change the directory to /usr/bin/chromedriver
```sh
sudo ln -s /usr/local/share/chromedriver /usr/local/bin/chromedriver
sudo ln -s /usr/local/share/chromedriver /usr/bin/chromedriver
```

Also, add chromedriver to your $PATH.

### Hope you like it

