javac *.java # The * just means to compile all the java files in the directory

if [$? = 0] # $? just means the exit code of the last command. a command with exit code 0 means it was successful, we only want to run the java program if the program compiled successfully
then
  java Main
else
  printf "\n\nError - Exit code $?"
fi