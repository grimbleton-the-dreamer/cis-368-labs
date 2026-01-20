
Main: Main.java Name.java Address.java
	javac -d classes Main.java

clean:
	rm classes/*.class

run: classes/Main.class
	java -cp classes Main
