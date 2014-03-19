all: parser.java Symbols.java Yylex.java

parser.java: appetizer.cup
	java -jar ../../../lib/java-cup-11a.jar -parser parser -symbols Symbols -interface < appetizer.cup

Symbols.java: appetizer.cup
	java -jar ../../../lib/java-cup-11a.jar -parser parser -symbols Symbols -interface < appetizer.cup

Yylex.java: appetizer.flex
	java -cp ../../../lib/JFlex.jar JFlex.Main appetizer.flex

clean:
	rm -f parser.java Symbols.java Yylex.java
