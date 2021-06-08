install: clean
	./gradlew install
clean:
	./gradlew clean
run-dist:
	./build/install/app/bin/app
check-updates:
	./gradlew dependencyUpdates
lint:
	./gradlew checkstyleMain
build:
	./gradlew clean build