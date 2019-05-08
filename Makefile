all:
	mkdir -p output/classbase
	cd ./src/classbase; javac -d ../../output/classbase Derived.java

	mkdir -p output/interfacebase
	cd ./src/interfacebase; javac -d ../../output/interfacebase Derived.java

	javac -cp ./output/interfacebase -d ./output src/Main.java

	java -cp ./output:./output/classbase Main

clean:
	rm -rf ./output
